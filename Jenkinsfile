pipeline {
    agent {
        docker {
            image 'gradle:4.7.0-jdk8-alpine'
        }
    }
    stages {
        stage('Build') {
            steps {
                echo 'Buliding.....'
                sh 'gradle build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing.....'
                sh 'gradle runTests'
            }
            post {
                success {
                    step([$class: 'Publisher', reportFilenamePattern: '**/testng-results.xml'])
                }
            }
        }
    }
}
