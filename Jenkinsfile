node{
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Compile-Build'){
               def mvnHome = tool name: 'Maven', type: 'maven'
               sh '${mvnHome}/bin/mvn package'
         }
}
