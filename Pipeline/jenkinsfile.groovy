pipeline {
  agent any
  stages {
    stage('Before Deploy Version') {
      steps {
        sh 'ansible-playbook Pipeline/Get-Version.yml'
      }
    }
    stage('Deploy Module') {
      steps {
        sh 'ansible-playbook Pipeline/Invoke-Deploy.yml'
      }
    }
    stage('After Deploy Version') {
      steps {
        sh 'ansible-playbook Pipeline/Get-Version.yml'
      }
    }
  }
}