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
            stash includes: 'target/**', name: 'mvn-target'
        }
    }
}
stage('Waiting for approval') {
    timeout(time: 120, unit: 'SECONDS') {
        input 'OK to install ?'
    }
}
node('maven3-jdk8') {
    withMaven(maven: 'maven3') {
        stage('Install') {
            unstash 'mvn-target'
            sh "mvn install"
        }
    }
}
