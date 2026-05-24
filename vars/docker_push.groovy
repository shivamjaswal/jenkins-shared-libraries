def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId:'dockerHubCred', passwordVariable:'dockerHubPass', usernameVariable: 'dockerHubUser')]){
                    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass} "
                    sh "docker image tag basic-app:latest ${env.dockerHubUser}/basic-app:latest"
                    sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
                }
}
