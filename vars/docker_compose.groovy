def call(){
  sh "docker-compose down && docker-compose -f django-notes-app/docker-compose.yml up -d"
}
