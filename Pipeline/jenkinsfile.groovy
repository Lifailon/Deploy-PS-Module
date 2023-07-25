pipeline {
  agent any
  stages {
    stage('Before Check Version') {
      steps {
        sh 'ansible-playbook Pipeline/Module-Version.yml'
      }
    }
  }
}