node{
    def mvnHome = tool (name: 'Maven', type: 'maven') + '/bin/mvn'
         stage('Test'){
               sh '${mvnHome} clean test'
         }
         stage('Configure-Build'){
               sh '${mvnHome} package'
         }
}
