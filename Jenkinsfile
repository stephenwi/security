pipeline {

      agent any {
          stages {
            stage('Git Checkout') {
               steps{
                  git 'https://github.com/stephenwi/security.git'
               }
            }
          }
      }
}