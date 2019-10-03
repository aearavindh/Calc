node{
      def mvnHome = 'Maven'
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Compile-Build'){
               withEnv( ["PATH+MAVEN=${tool mvnHome}/bin"] ) {
               sh 'mvn clean package'
               }
         }
         stage('SonarQube Analysis'){
               agent any
               steps{
                     withSonarQubeEnv('sonarqube'){
                           sh 'mvn clean package sonar:sonar'
                     }
               }
         }
}
