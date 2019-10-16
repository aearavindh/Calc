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
        stage('Sonarqube Analysis'){
            steps{
                withSonarQubeEnv('SonarScanner'){
                    sh 'sonar-scanner -Dproject.settings=./sonar-project.properties'
                }
            }
        }
        stage('Publish to Nexus'){
            steps{
                withCredentials([usernamePassword(credentialsId: 'nexus-credentialss', passwordVariable: 'password', usernameVariable: 'username'),string(credentialsId: 'NEXUS_URL', variable: 'nexus_url')]){
                //sh 'curl -v -F r=devopstraining -F hasPom=true -F e=jar -F file=@pom.xml -F file=@target/Calc-CALC-1.0.jar -u ${username}:${password} http://18.224.155.110:8081/nexus/content/repositories/devopstraining/comrades/Calc-CALC-1.0.jar'
                //sh 'curl -u ${username}:${password} --upload-file target/Calc-CALC-1.0.jar http://18.224.155.110:8081/nexus/content/repositories/devopstraining/comrades/Calc.jar'
                    sh 'curl -F file=@target/Calc-CALC-1.0.jar -u ${username}:${password} http://${nexus_url}/nexus/content/repositories/devopstraining/comrades/Calc.jar'
                }
            } 
       }
       stage('Deploy to Tomcat'){
            steps{
                withCredentials([usernamePassword(credentialsId: 'tomcatCredentials', passwordVariable: 'password', usernameVariable: 'username'),string(credentialsId: 'TOMCAT_URL', variable: 'tomcat_url')]){
                    sh 'curl http://${tomcat_url}/manager/text/undeploy?path=/CALC -u ${username}:${password}'
                    sh 'curl -v -u ${username}:${password} -T target/Calc-CALC-1.0.jar http://${tomcat_url}/manager/text/deploy?path=/CALC'
                }
            } 
       }
   }
}
