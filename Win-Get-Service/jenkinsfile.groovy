pipeline {
  agent any
  parameters {
    string(name: "Service_Name", defaultValue: "WinRM", trim: true, description: "Service name")
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Выбрана версия: $params.Version"
        sh 'ansible-playbook Win-Get-Service/Get-Service.yml'
      }
    }
  }
}