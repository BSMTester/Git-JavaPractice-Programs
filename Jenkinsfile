pipeline{
 agent any
 tools{
  maven 'Maven 3.8.5'
 }
  stages{
    stage('Checkout'){
      steps {
        git url: 'https://github.com/BSMTester/Git-JavaPractice-Programs.git',
        branch: 'master'
        }
      }
      stage('Build'){
        steps {
            sh 'mvn clean install'
        }
      }
    }
}
