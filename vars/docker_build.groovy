def call(String ImageTag, String ImageName, String dockerHubUser){
  sh "docker build -t ${dockerHubUser}/${ImageName}:${ImageTag} ./django-notes-app"
  
}
