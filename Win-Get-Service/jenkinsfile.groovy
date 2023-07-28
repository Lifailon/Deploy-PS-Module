pipeline {
  agent any
  parameters {
    string(name: "ServiceName", defaultValue: "WinRM", trim: true, description: "Введите имя службы") // создать параметр
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Имя выбранной службы: $params.ServiceName"
        sh "ansible-playbook Win-Get-Service/Get-Service.yml -e ServiceName=$params.ServiceName" // передать параметр на вход переменной playbook
      }
    }
  }
}