pipeline {
    agent any
    tools {
        maven "Maven"   
    }
    environment {
        NEXUS_CRED = ('nexus-credentialss')
    }
    stages {
        stage('Compile-Build-Test') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Publish to Nexus'){
            steps{
                sh 'curl -v -F r=devopstraining -F hasPom=true -F e=war -F g=comrades.aea -F a=Calc -F v=5.0 -F c=ArithmeticCalculator -F p=war -F file=@./target/Calc-CALC-1.0.war -u $NEXUS_CRED http://18.224.155.110:8081/nexus'
            }
        }
    }
}
