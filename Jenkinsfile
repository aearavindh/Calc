node{
      def mvnHome = tool name: 'Maven', type: 'maven'
         stage('SCM Checkout'){
               git 'https://github.com/aearavindh/Calc.git'
         }
         stage('Compile-Build'){
                  sh '${mvnHome}/bin mvn clean package'
         }
}
