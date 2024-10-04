pipeline {
    agent any

    stages {
        stage('Build war file from github') {
            steps {
                echo 'Building..'
            }
        }
        stage('Build') {
            steps {
                cmd 'mvn clean package'
                echo 'Package was build'
            }
            post {
                success {
                    echo 'Archiving the artefact'
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
    }
}