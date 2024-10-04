pipeline {
    agent any

    stages {
        
        stage('Build application') {
            steps {
                bat 'mvn clean package'
                
            }
            post {
                success {
                    echo 'Archiving the artefact'
                    archiveArtifacts artifacts: '**/*.war'
                }
            }
        }
        stage('Push app to Server'){
            steps {
                input message: 'Approve for deployement?'    
                
            }
            steps {
                build job: 'pushWARtoTomcat'    
                
            }
            
        }
            
    }
}