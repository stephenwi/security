pipeline {

      agent any

          stages {
            stage('Git Checkout') {
               steps{
                  script{
                    git 'https://github.com/stephenwi/security.git'
                  }
               }
            }
          }

}