def call(){
  sh "docker compose -f django-notes-app/docker-compose.yml up -d"
}
