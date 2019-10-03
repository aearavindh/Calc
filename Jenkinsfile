pipeline {
    agent any
    tools {
        maven "Maven"   
    }    
    stages {
        stage('Compile-Build-Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage("SonarQube Analysis"){
            steps{
                withSonarQubeEnv('sonarqube'){
                    sh 'mvn sonar:sonar'
                }
            }
        }
    }
}
