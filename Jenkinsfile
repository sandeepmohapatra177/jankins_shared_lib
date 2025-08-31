@Library("jenkins_shared_lib") _

pipeline{
    agent { label 'sandeep'}
    stages{
       stage('hello'){
           steps{
               script{
                   hello()
               }
           }
       }
       stage('dev'){
           steps{
               script{
                   clone("https://github.com/sandeepmohapatra177/projects.git","main")
               }
           }
       }

       stage('build'){
           steps{
               script{
                   docker_build("latest","notesapp","sandeepmohapatra177")
               }
           }
       }
       stage('dockerhub'){
           steps{
               script{
                   docker_push("latest","notesapp","sandeepmohapatra177")
               }
           }
       }
       stage('deploy'){
           steps{
               script{
                   docker_compose()
               }
           }
       }
    }  
}
