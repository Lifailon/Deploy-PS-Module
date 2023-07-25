pipeline {
  agent any
  stages {
    stage('Check Version') {
      steps {
        sh 'ansible-playbook test/Module-Version.yml'
      }
    }
    stage('Deploy Module') {
      steps {
        sh 'ansible-playbook test/Module-Deploy.yml'
      }
    }
  }
}