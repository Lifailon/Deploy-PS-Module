pipeline {
  agent any
  parameters {
    string(name: "Version", defaultValue: "0.7", trim: true, description: "Выбрать версию модуля")
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Выбрана версия: $params.Version"
        sh 'ansible-playbook Pipeline/Get-Version.yml'
      }
    }
    stage('Deploy Module') {
      steps {
        sh 'ansible-playbook Pipeline/Invoke-Deploy.yml -M /root/.ansible/collections/ansible_collections/ansible/windows/plugins/modules'
      }
    }
    stage('After Deploy Version') {
      steps {
        sh 'ansible-playbook Pipeline/Get-Version.yml'
      }
    }
  }
}