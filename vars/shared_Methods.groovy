#!/usr/bin/env groovy
def sayHello(String name = 'human') {
  node('master'){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

def getSource(String nodeName = 'master', String branchName = 'main', String credentialsId = 'vwaghmode19-github'){
        node(nodeName){
                stage("Checkout") {
                                checkout scm: [$class           : 'GitSCM',
                                        branches          : [[name: branchName]],
                                        userRemoteConfigs : [[credentialsId: credentialsId, url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
                                ]
                }
        }
}

return this
