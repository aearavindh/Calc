pipeline{
  agent any
     stages{
       stage('Compile-Build'){
         sh 'mvn clean package'
       }
       stage('SonarQube Analysis'){
         sh 'mvn sonar:sonar'
       }
     }
}
