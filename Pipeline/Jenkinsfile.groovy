pipeline {
  agent any
  parameters {
    // creat parameters
    string(name: "ServiceName", defaultValue: "ssh", trim: true, description: "Enter the name of the service")
    booleanParam(name: "ChangeState", defaultValue: false)
    choice(name: "State", choices: ["Stop","Restart","Start"], description: "Select state")
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Name of the selected service: $params.ServiceName"
        sh "ansible-playbook Pipeline/Get-Service.yml -e ServiceName=$params.ServiceName State=$params.State" // pass parameter to the playbook variable
      }
    }
  }
}