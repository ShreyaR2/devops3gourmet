pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building project...'
                    sh 'echo Build successful'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    echo 'Running tests...'
                    sh 'echo Tests passed'
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying application...'
                    sh 'echo Deployment complete'
                }
            }
        }
    }
}
