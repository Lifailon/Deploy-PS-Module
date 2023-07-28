pipeline {
  agent any
  parameters {
    string(name: "Service_Name", defaultValue: "WinRM", trim: true, description: "Service name")
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Имя выбранной службы: $params.Service_Name"
        sh 'ansible-playbook Win-Get-Service/Get-Service.yml'
      }
    }
  }
}