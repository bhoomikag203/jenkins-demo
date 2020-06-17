pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Buliding.....'
                sh './gradlew check'
            }
        }
    }
}
