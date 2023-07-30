pipeline {
  agent any
  parameters {
    // creat parameters
    string(name: "ServiceName", defaultValue: "sshd", trim: true, description: "Enter the name of the service")
    // booleanParam(name: "ChangeState", defaultValue: false)
    choice(name: "State", choices: ["None","Start","Restart","Stop"], description: "None - only get status")
    choice(name: "StartType", choices: ["None","Automatic","AutomaticDelayedStart","Disabled","Manual"], description: "Delayed Start mode supported only PowerShell 7")
    choice(name: "System", choices: ["Windows","Linux"], description: "Select the operating system")
  }
  stages {
    stage('PowerShell via Ansible') {
      steps {
        echo "Name of the selected service: $params.ServiceName"
        // pass parameters to the input of ansible variables
        sh "ansible-playbook Pipeline/Get-Service.yml -e 'ServiceName=$params.ServiceName State=$params.State StartType=$params.StartType System=$params.System '"
      }
    }
  }
}