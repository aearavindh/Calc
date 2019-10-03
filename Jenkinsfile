pipeline{
      stages{
         stage('SCM Checkout'){
            steps{
               git 'https://github.com/aearavindh/Calc.git'
            }
         }
         stage('Test'){
            steps{
               sh 'mvn test'
            }
         }
         stage('Configure-Build'){
            steps{
               sh 'mvn package'
            }
         }
      }
}
