def call(String ImageTag, String ImageName, String dockerHubUser){
  withCredentials([usernamePassword (credentialsId: "dockerHubCred",usernameVariable: "dockerHubUser" , passwordVariable: "dockerHubPass")]){
               sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
               sh "docker image tag notesapp:latest ${env.dockerHubUser}/${ImageName}:${ImageTag}"
               
  }
  sh "docker push ${env.dockerHubUser}/${ImageName}:latest"
}
