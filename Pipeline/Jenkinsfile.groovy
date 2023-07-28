pipeline {
  agent any
  parameters {
    string(name: "ServiceName", defaultValue: "WinRM", trim: true, description: "Enter the name of the service") // creat parameter
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Name of the selected service: $params.ServiceName"
        sh "ansible-playbook Win-Get-Service/Get-Service.yml -e ServiceName=$params.ServiceName" // pass parameter to the playbook variable
      }
    }
  }
}