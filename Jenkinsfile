pipeline {

 agent any

 environment {
         JAVA_HOME = "/usr/lib/jvm/java-17-openjdk-amd64/"
         M2_HOME = "/opt/apache-maven-3.6.3"
         PATH = "$M2_HOME/bin:$PATH"

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
  sh 'mvn sonar:sonar -Dsonar.projectKey=timesheet-devops -Dsonar.projectName=timesheet-devops -Dsonar.login=squ_a83b39c88f38bdd4d08f4cdc83a587b046d5129f'
}
}
}

}


}