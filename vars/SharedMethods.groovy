#!/usr/bin/env groovy
def sayHello(String nodeName, String name) {
  node(nodeName){
    stage("Say Hello"){
      echo "Hello, ${name}."
    }
  }
}

//def getSource(String nodeName = 'master', String branchName = 'main', String credsID = 'vwaghmode19-github', String repoURL){
def getSource(String nodeName, String branchName, String credsID, String repoURL){
  node(nodeName){
    stage("Code Checkout") {
      echo "Checking out ${branchName} branch from ${repoURL} repository"
      checkout scm: [$class             : 'GitSCM',
                     branches           : [[name: branchName]],
                     userRemoteConfigs  : [[credentialsId: credsID, url: repoURL]]
                    ]
    }
  }
}

return this
