pipeline {
  agent any
  parameters {
    string(name: "ServiceName", defaultValue: "sshd", trim: true, description: "Enter the name of the service")
    // booleanParam(name: "ChangeState", defaultValue: false)
    choice(name: "State", choices: ["None","Start","Restart","Stop"], description: "None - only get status")
    choice(name: "StartType", choices: ["None","Automatic","AutomaticDelayedStart","Disabled","Manual"], description: "Delayed Start mode supported only PowerShell 7")
    choice(name: "System", choices: ["Windows","Linux"], description: "Select the operating system")
  }
  stages {
    stage('Powershell via Ansible') {
      when {
        expression { params.System == 'Windows' }
      }
      steps {
        echo "Name of the selected service: $params.ServiceName"
        sh "ansible-playbook Pipeline/Get-Service.yml -e 'ServiceName=$params.ServiceName State=$params.State StartType=$params.StartType'"
      }
    }
    stage('Systemctl via Ansible') {
      when {
        expression { params.System == 'Linux' }
      }
      steps {
        echo "Name of the selected service: $params.ServiceName"
        sh "ansible-playbook Pipeline/Systemctl.yml"
      }
    }
  }
}