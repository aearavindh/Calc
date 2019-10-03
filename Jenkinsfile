node{
         stage('Test'){
            steps{
               def mvnHome = tool name: 'Maven', type: 'maven'
               sh '${mvnHome}/bin/mvn test'
            }
         }
         stage('Configure-Build'){
            steps{
               def mvnHome = tool name: 'Maven', type: 'maven'
               sh '${mvnHome}/bin/mvn package'
            }
         }
}
