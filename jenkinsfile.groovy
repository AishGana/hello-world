pipeline{
  agent any
  stages {
    node {
        stage('Build') {
          steps{
         echo "building the project"  
          }
        }
        stage('Test') {
          steps{
         echo "building the project"
          }
        }
        stage('Deploy') {
          steps{
         echo "building the project"  
          }
        }
        stage('Release') {
          steps{
         echo "building the project"  
          }
        }
    
    }
  }
}
