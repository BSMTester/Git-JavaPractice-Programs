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
        }
        failure {
            slackSend(channel: '#your-channel', message: "❌ FAILED: Build failed on branch ${env.BRANCH_NAME}")
        }
    }
}
