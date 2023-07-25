pipeline {
  agent any
  stages {
    stage('Check Local Version') {
      steps {
        sh 'ansible-playbook test/Get-Module-Version.yml'
      }
    }
  }
}