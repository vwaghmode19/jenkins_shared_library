#!/usr/bin/env groovy
def sayHello(String name = 'human') {
  node('master'){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

def checkoutFn(String branchName, String credentialsId){
        node('master'){
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

