node{
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Compile-Build'){
               def mvn_version = 'Maven'
               withEnv( ["PATH+MAVEN=${tool mvn_version}/bin"] ) {
               sh 'mvn clean package'
               }
         }
}
