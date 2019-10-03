pipeline{
  agent any
     stages{
       stage('Compile-Build'){
         steps{
            sh 'mvn clean package'
         }
       }
       stage('SonarQube Analysis'){
         steps{
            sh 'mvn sonar:sonar'
         }
       }
     }
}
