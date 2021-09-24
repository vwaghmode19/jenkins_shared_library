#!/usr/bin/env groovy
def sayHello(String nodeName = 'master', String name = 'human') {
  node(nodeName){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

def getSource(String nodeName = 'master', String branchName = 'main', String credsID = 'vwaghmode19-github', String repoURL){
        node(nodeName){
                stage("Code Checkout") {
                                checkout scm: [$class     : 'GitSCM',
                                        branches          : [[name: branchName]],
                                        userRemoteConfigs : [[credentialsId: credsID, url: repoURL]]
                                ]
                }
        }
}

return this
