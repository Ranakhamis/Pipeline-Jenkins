pipeline {
  agent any
  stages {
    stage('fetch from github') {
      post {
        success {
          sh 'ls'
        }

      }
      steps {
        sh 'if cd Pipeline-Jenkins; then git pull; else git clone https://github.com/Ranakhamis/Pipeline-Jenkins.git; fi'
      }
    }

    stage('install dependencies') {
      steps {
        sh 'sudo apt install openjdk-8-jre-headless -y'
        sh 'sudo apt-get install openjdk-8-jdk -y'
        sh '''sudo apt install maven -y
'''
      }
    }

    stage('build project dependecies') {
      steps {
        sh 'cd Pipeline-Jenkins && mvn clean compile'
      }
    }

    stage('run the test') {
      steps {
        sh 'cd Pipeline-Jenkins && mvn test'
      }
    }

  }
}