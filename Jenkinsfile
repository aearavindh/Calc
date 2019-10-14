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
                withCredentials([usernamePassword(credentialsId: 'nexus-credentialss', passwordVariable: 'password', usernameVariable: 'username')]){
                sh 'curl -v -F r=devopstraining -F hasPom=true -F e=jar -F g=comrades.aea -F a=Calc -F v=5.0 -F c=ArithmeticCalculator -F p=jar -F file=@target/Calc-CALC-1.0.jar -u ${username}:${password} http://18.224.155.110:8081/nexus/content/repositories/devopstraining/comrades/Calc.jar'
                //sh 'curl -u ${username}:${password} --upload-file target/Calc-CALC-1.0.jar http://18.224.155.110:8081/nexus/content/repositories/devopstraining/comrades/Calc.jar'
                //sh 'curl -v -F r=devopstraining -F hasPom=true -F file=@target/Calc-CALC-1.0.jar -u ${username}:${password} http://18.224.155.110:8081/nexus/devopstraining/comrades'
                }
            }
        }
    }
}
