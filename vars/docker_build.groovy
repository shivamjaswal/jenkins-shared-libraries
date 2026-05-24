def call(String ProjectName, String ImageTag, String DockerHubUser){
  sh "mvn clean package"
  // sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  sh "docker build -t ${ProjectName}:${ImageTag} ."
}
