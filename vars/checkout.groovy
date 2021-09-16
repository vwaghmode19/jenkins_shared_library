#!/usr/bin/env groovy
//@NonCPS
def checkout(String node, String repoURL, String branchName, String credentialsId){
	node(node){
		stage("Checkout") {
				checkout([$class           : 'GitSCM', 
					branches          : [[name: branchName]], 
					userRemoteConfigs : [[credentialsId: credentialsId, url: 'git@github.com:vwaghmode19/simple-java-maven-app.git']]
				])
			}
		}
	}

Map sourceCheckout() {
    echo "Checkout"
    return checkout(scm)
}
