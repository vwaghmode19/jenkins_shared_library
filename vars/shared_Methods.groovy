#!/usr/bin/env groovy
def sayHello(String name = 'human') {
  node('master'){
        stage("Say Hello"){
        echo "Hello, ${name}."
        }
  }
}

// def checkoutFn(String branchName, String credentialsId){
//         node('master'){
//                 stage("Checkout") {
//                                 checkout([$class           : 'GitSCM',
//                                         branches          : [[name: branchName]],
//                                         userRemoteConfigs : [[credentialsId: credentialsId, url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
//                                 ])
//                       }
//         }
// }

def simpleCheckout() {
    
    checkout(
            changelog: false,
            poll: false,
            scm: [
                    $class                           : 'GitSCM',
                    branches                         : 'main',
                    //userRemoteConfigs                : 'git@github.com:vwaghmode19/jenkins_shared_library.git'
					          userRemoteConfigs : [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
    ])
}
