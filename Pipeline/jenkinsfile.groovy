pipeline {
  agent any
  stages {
    stage('Before Check Version') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Version.yml'
      }
    }
    stage('Deploy Module') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Deploy.yml'
      }
    }
    stage('After Deploy Module') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Version.yml'
      }
    }
  }
}