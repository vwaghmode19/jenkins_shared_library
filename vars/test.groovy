#!/usr/bin/env groovy

def sayHello(String name = 'human') {
  echo "Hello, ${name}."
}

def getRepoURL(String url){
	def repoURL = url
	echo repoURL
}

def checkoutRepo(String branchName){
/*	checkout(scm: [$class             : 'GitSCM', 
			   branches          : [[name: + 'branchName']], 
			   userRemoteConfigs : [[url: + getRepoURL.repoURL ]]
*/	script{
	def codeCheckout = "checkout([$class: 'GitSCM', branches: [[name: '*/main']], userRemoteConfigs: [[credentialsId: 'vwaghmode19-github',          url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]])"
	sh script: codeCheckout
	}


	])
}
