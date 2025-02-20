pipeline {

 agent any

 environment {
         JAVA_HOME = "/usr/lib/jvm/java-17-openjdk-amd64/"
         M2_HOME = "/opt/apache-maven-3.6.3"
         PATH = "$M2_HOME/bin:$PATH"
         SONAR_TOKEN = 'sqp_a7a981a0f4c5c712ca5f14fbf991dee4dc09af95'
     }

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
 stage ('SonarQube analysis') {
steps{
withSonarQubeEnv('SonarQube') {
  sh 'mvn sonar:sonar -Dsonar.projectKey=timesheet-devops -Dsonar.projectName=timesheet-devops -Dsonar.login=$SONAR_TOKEN'
}
}
}

}


}