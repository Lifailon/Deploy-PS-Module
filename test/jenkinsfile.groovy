pipeline {
  agent any
  stages {
    stage('Check Version') {
      steps {
        sh 'ansible-playbook test/Get-Module-Version.yml'
      }
    }
  }
}