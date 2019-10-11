pipeline {
    agent any
    tools {
        maven "Maven"   
    }
    environment{
        NEXUS_VERSION="nexus2"
        NEXUS_PROTOCOL="http"
        NEXUS_URL="18.224.155.110:8081/nexus"
        NEXUS_REPOSITORY="devopstraining"
        NEXUS_CREDENTIAL_ID="nexus-credentials"
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
                script{
                    pom = readMavenPom file: "pom.xml";
                    filesByGlob = findFiles(glob: "target/*.${pom.packaging}");
                    echo "${filesByGlob[0].name} ${filesByGlob[0].path} ${filesByGlob[0].directory} ${filesByGlob[0].length} ${filesByGlob[0].lastModified}";
                    artifactPath = filesByGlob[0].path;
                    artifactExists = fileExists artifactPath;
                    if(artifactExists) {
                        echo "*** File: ${artifactPath}, group: ${pom.groupId}, packaging: ${pom.packaging}, version ${pom.version}";
                        nexusArtifactUploader(
                            nexusVersion: NEXUS_VERSION,
                            protocol: NEXUS_PROTOCOL,
                            nexusUrl: NEXUS_URL,
                            groupId: pom.groupId,
                            version: pom.version,
                            repository: NEXUS_REPOSITORY,
                            credentialsId: NEXUS_CREDENTIAL_ID,
                            artifacts: [
                                [artifactId: pom.artifactId,
                                classifier: '',
                                file: artifactPath,
                                type: pom.packaging]
                            ]
                        );
                    } else {
                        error "*** File: ${artifactPath}, could not be found";
                    }
                }
            }
        }
    }
}
