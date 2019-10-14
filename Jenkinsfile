pipeline {
    agent any
    tools {
        maven "Maven"   
    }
    stages {
        stage('Compile-Build-Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Publish to Nexus'){
            steps{
                //nexusArtifactUploader artifacts: [[artifactId: 'Calc', classifier: '', file: 'pom.xml', type: 'jar']], credentialsId: 'nexus-credentialss', groupId: 'comrades.aea', nexusUrl: '18.224.155.110:8081/nexus', nexusVersion: 'nexus2', protocol: 'http', repository: 'devopstraining', version: 'CALC-1.0'
                curl -v -F r=devopstraining -F hasPom=true -F e=war -F g=comrades.aea -F a=Calc -F v=5.0 -F c=ArithmeticCalculator -F p=war -F file=@**/target/*.war -u trainee:trainee http://18.224.155.110:8081/nexus/devopstrainng
             // curl -u trainee:trainee --upload-file Calc.tgz $http://18.224.155.110:8081/nexus
                  }
        }
    }
}
