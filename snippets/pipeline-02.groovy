node('maven3-jdk8') {
   stage('Checkout Code') {
       checkout scm
   }
   def mvnHome = tool 'maven3'
   stage('Build') {
       sh "${mvnHome}/bin/mvn clean compile"
   }
   stage('Unit Tests') {
       sh "${mvnHome}/bin/mvn test"
   }
   stage('Packaging') {
       sh "${mvnHome}/bin/mvn package"
   }
   stage('Integration Tests') {
       sh "${mvnHome}/bin/mvn verify"
   }
   stage('Install') {
       sh "${mvnHome}/bin/mvn install"
   }
}
