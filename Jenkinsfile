pipeline {
   parameters {
      string(name: 'IMAGE_REPO_NAME', defaultValue: '172.16.10.250:5000/myappauto1', description: '')
    }
    agent any
    stages {

        stage('mvn build')
        {
            steps{
               sh "mvn clean package"
            }
        }

    }
}