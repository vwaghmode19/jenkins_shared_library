#!/usr/bin/env groovy
@NonCPS
void checkout(String node, String repoURL, String branchName, String credentialsId){
	node(node){
		stage("Checkout") {
				checkout([$class           : 'GitSCM', 
					branches          : [[name: branchName]], 
					userRemoteConfigs : [[credentialsId: credentialsId, url: repoURL]]
				])
			}
		}
	}
