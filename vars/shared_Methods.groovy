#!/usr/bin/env groovy
def sayHello(String name = 'human') {
  node('master'){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

def checkout(String node, String branchName, String credentialsId){
        node(node){
                stage("Checkout") {
                        script{
                                checkout([$class           : 'GitSCM',
                                        branches          : [[name: branchName]],
                                        userRemoteConfigs : [[credentialsId: credentialsId, url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
                                ])
                        }
                }
        }
}

