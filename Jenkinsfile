pipeline { 
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo '========== STAGE 1: CHECKOUT =========='
                echo 'Connecting to source code repository...'
                echo 'Pulling latest code from branch: master'
                echo 'Source code checked out successfully!'
            }
        }

        stage('Build') {
            steps {
                echo '========== STAGE 2: BUILD =========='
                echo 'Compiling Java source files...'
                echo 'Resolving Maven dependencies...'
                echo 'Build completed successfully! No errors found.'
            }
        }

        stage('Test') {
            steps {
                echo '========== STAGE 3: TEST =========='
                echo 'Running unit tests...'
                echo 'Test 1: UserServiceTest        --> PASSED'
                echo 'Test 2: OrderControllerTest    --> PASSED'
                echo 'Test 3: PaymentValidationTest  --> PASSED'
                echo '3/3 tests passed. 0 failures.'
            }
        }

        stage('Package') {
            steps {
                echo '========== STAGE 4: PACKAGE =========='
                echo 'Packaging application into JAR file...'
                echo 'JAR created: target/my-java-app-1.0.jar'
                echo 'Package size: 12.4 MB'
            }
        }

        stage('Deploy') {
            steps {
                echo '========== STAGE 5: DEPLOY =========='
                echo 'Uploading JAR to deployment server...'
                echo 'Starting application on server...'
                echo 'App is live at: http://localhost:8080'
                echo 'Deployment complete!'
            }
        }

    }

    post {
        success {
            echo ''
            echo '=========================================='
            echo '   PIPELINE SUCCEEDED! Great job!'
            echo '=========================================='
        }
        failure {
            echo ''
            echo '=========================================='
            echo '   PIPELINE FAILED! Check the logs above.'
            echo '=========================================='
        }
        always {
            echo 'Pipeline finished. Cleaning up workspace...'
        }
    }
}
