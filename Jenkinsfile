pipeline {
    agent any

    tools {
        maven 'Maven-3'   // must match Jenkins Global Tool config
        jdk 'JDK-17'      // must match Jenkins Global Tool config
    }

    environment {
        JAVA_HOME = tool name: 'JDK-17'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {

        stage('Checkout') {
            steps {
                git 'https://github.com/cheqro/Jenkins-first'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo '✅ Build succeeded!'
        }
        failure {
            echo '❌ Build failed!'
        }
    }
}