pipeline {
  agent any
  stages {
    stage('Check Version') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Version.yml'
      }
    }
    stage('Deploy Module') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Deploy.yml'
      }
    }
  }
}