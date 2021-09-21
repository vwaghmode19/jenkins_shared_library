#!/usr/bin/env groovy
def sayHello(String name = 'human') {
  node('master'){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

def getSource(String nodeName, String branchName, String credentialsId){
        node(nodeName){
                stage("Checkout") {
                                checkout([$class           : 'GitSCM',
                                        branches          : [[name: branchName]],
                                        userRemoteConfigs : [[credentialsId: credentialsId, url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
                                ])
                }
        }
}

return this
