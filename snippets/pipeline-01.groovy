node('maven3-jdk8') {
   stage('Checkout Code') {
       git 'http://localhost:10000/gitserver/dev/gameoflife.git'
       sh 'ls -al'
   }
}
