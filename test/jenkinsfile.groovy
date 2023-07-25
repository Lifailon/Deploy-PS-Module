pipeline {
  agent any
  stages {
    stage('PowerShell Version') {
      steps {
        sh 'pwsh --version'
      }
    }
    stage('Drive Size') {
      steps {
        sh 'df -h | grep /dev/mapper'
        sh 'pwsh -command "Get-PSDrive | where name -match /"'
      }
    }
    stage('Process SSH') {
      steps {
        sh 'ansible-playbook test/Get-PowerShell.yml'
      }
    }
  }
}