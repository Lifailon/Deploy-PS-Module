pipeline {
  agent any
  parameters {
    string(name: "Service_Name", defaultValue: "WinRM", trim: true, description: "Service name")
  }
  stages {
    stage('Before Deploy Version') {
      steps {
        echo "Искомая служба: $params.Service_Name"
      }
    }
  }
}