pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'
        jdk 'Java 11'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install -DskipTests'
            }
        }
    }

    post {
        success {
            slackSend(channel: '#your-channel', message: "✅ SUCCESS: Build passed on branch ${env.BRANCH_NAME}")
        emailext (
            subject: "Jenkins SUCCESS: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
            body: "Good news! The build succeeded.\n\nJob: ${env.JOB_NAME}\nBuild: ${env.BUILD_URL}",
            to: 'testerbsm123@gmail.com'
        )
        }
        failure {
            slackSend(channel: '#your-channel', message: "❌ FAILED: Build failed on branch ${env.BRANCH_NAME}")
            emailext (
            subject: "Jenkins FAILURE: ${env.JOB_NAME} [${env.BUILD_NUMBER}]",
            body: "Oops! The build failed.\n\nJob: ${env.JOB_NAME}\nBuild: ${env.BUILD_URL}",
            to: 'testerbsm123@gmail.com'
        )
        }
    }
}
