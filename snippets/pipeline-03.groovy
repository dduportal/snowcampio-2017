node('maven3-jdk8') {
   stage('Checkout Code') {
       checkout scm
   }
   withEnv(["PATH+MAVEN=${tool 'maven3'}/bin"]) {
       stage('Build') {
           sh "mvn clean compile"
       }
       stage('Unit Tests') {
           sh "mvn test"
       }
       stage('Packaging') {
           sh "mvn package"
       }
       stage('Integration Tests') {
           sh "mvn verify"
       }
   }
   withMaven(maven: 'maven3') {
       stage('Install') {
           sh "mvn install"
       }
   }
}
