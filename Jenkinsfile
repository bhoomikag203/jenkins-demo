pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Buliding.....'
                sh './gradle check'
            }
        }
    }
}
