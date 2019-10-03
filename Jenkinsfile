pipeline{
        agent any
      stages{
         stage('SCM Checkout'){
            steps{
               git 'https://github.com/aearavindh/Calc.git'
            }
         }
         stage('Test'){
            steps{
               def mvnHome = tool name: 'Maven', type: 'maven'
               sh '${mvnHome}/bin/mvn test'
            }
         }
         stage('Configure-Build'){
            steps{
               def mvnHome = tool name: 'Maven', type: 'maven'
               sh '${mvnHome}/bin/mvn package'
            }
         }
      }
}
