node{
    def mvnHome = tool (name: 'Maven', type: 'maven') + '/bin/mvn'
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Compile-Build'){
               sh '${mvnHome} package'
         }
}
