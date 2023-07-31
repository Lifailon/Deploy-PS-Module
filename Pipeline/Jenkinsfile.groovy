pipeline {
  agent any
  parameters {
    string(name: "ServiceName", defaultValue: "cron", trim: true, description: "Enter the name of the service")
    choice(name: "System", choices: ["Windows","Linux"], description: "Select the operating system")
    // booleanParam(name: "ChangeState", defaultValue: false)
    choice(name: "State", choices: ["None","Start","Restart","Stop"], description: "None - only get status")
    choice(name: "StartType", choices: ["None","Enable","Disabled","Manual","Automatic","AutomaticDelayedStart"], description: "Enable mode - for system Linux /n Automatic/Manual mode - for system Windows /n Delayed Start mode - supported only PowerShell 7")
  }
  stages {
    stage('Powershell via Ansible') {
      when {
        expression { params.System == 'Windows' }
      }
      steps {
        echo "Selected service - $params.ServiceName"
        echo "Selected parameters - State: $params.State and StartType: $params.StartType"
        sh "ansible-playbook Pipeline/Get-Service.yml -e 'ServiceName=$params.ServiceName State=$params.State StartType=$params.StartType'"
      }
    }
    stage('Systemctl via Ansible') {
      when {
        expression { params.System == 'Linux' }
      }
      steps {
        echo "Selected service - $params.ServiceName"
        echo "Selected parameters - State: $params.State and StartType: $params.StartType"
        sh "ansible-playbook Pipeline/Systemctl.yml -e 'ServiceName=$params.ServiceName State=$params.State' -b"
      }
    }
  }
}