node{
      def mvnHome = 'Maven'
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Test'){
               withEnv( ["PATH+MAVEN=${tool mvnHome}/bin"] ) {
               sh 'mvn clean test'
               }
         }
         stage('Compile-Build'){
               withEnv( ["PATH+MAVEN=${tool mvnHome}/bin"] ) {
               sh 'mvn package'
               }
         }
}
