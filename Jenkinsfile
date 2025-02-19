pipeline {

 agent any

 tools {jdk 'java-17-openjdk-amd64', maven 'apache-maven-3.0.1'}

 stages {

 stage('GIT') {

           steps {

               git branch: 'main',

               url: 'https://github.com/EyaNehdi/TimeSheet_Devops.git'

          }

     }

 stage ('Compile Stage') {

 steps {

 sh 'mvn clean compile'

 }

 }

 }

}