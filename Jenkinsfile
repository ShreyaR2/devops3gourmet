pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo '========== STAGE 1: CHECKOUT =========='
                echo 'Cloning repository from GitHub...'
                checkout scm
                echo 'Code checked out successfully!'
            }
        }

        stage('Build') {
            steps {
                echo '========== STAGE 2: BUILD =========='
                echo 'Compiling the Java application...'
                sh 'mkdir -p out'
                sh 'javac src/Calculator.java src/CalculatorTest.java -d out/'
                echo 'Build successful!'
            }
        }

        stage('Test') {
            steps {
                echo '========== STAGE 3: TEST =========='
                echo 'Running tests...'
                sh 'java -cp out/ CalculatorTest'
                echo 'Tests completed!'
            }
        }

        stage('Deploy') {
            steps {
                echo '========== STAGE 4: DEPLOY =========='
                echo 'Packaging application...'
                sh 'jar cf calculator.jar -C out/ .'
                echo 'JAR created: calculator.jar'
                echo 'Deployment simulation complete!'
            }
        }

    }

    post {
        success {
            echo '=========================================='
            echo '   PIPELINE SUCCEEDED! Great job!'
            echo '=========================================='
        }
        failure {
            echo '=========================================='
            echo '   PIPELINE FAILED! Check logs above.'
            echo '=========================================='
        }
        always {
            echo 'Pipeline finished.'
        }
    }
}
