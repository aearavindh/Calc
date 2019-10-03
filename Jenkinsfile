node{
    def mvnHome = tool (name: 'Maven', type: 'maven') + '/bin/mvn'
         stage('SCM Checkout'){
               git ''
         }
         stage('Compile-Build'){
               sh '${mvnHome} clean package'
         }
}
