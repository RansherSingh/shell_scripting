pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'docker build -t ransher_v1 . && docker run ransher_v1 '
            }
        }
    }
}
