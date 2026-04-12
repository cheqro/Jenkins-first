pipeline {
    agent any

    parameters {
        booleanParam(name: 'SKIP_TESTS', defaultValue: false, description: 'Skip unit tests')
    }

    tools {
        maven 'Maven-3'   // must match Jenkins Global Tool config
        jdk 'JDK-17'      // must match Jenkins Global Tool config
    }

    environment {
        JAVA_HOME = tool name: 'JDK-17'
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
    }

    stages {

        stage('Build') {
            steps {
               script {
                       if (params.SKIP_TESTS) {
                           sh 'mvn clean package -DskipTests'
                       } else {
                               sh 'mvn clean package'
                               }
                       }
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