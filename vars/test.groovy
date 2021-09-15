#!/usr/bin/env groovy

def sayHello(String name = 'human') {
  echo "Hello, ${name}."
}

def getRepoURL(string url){
	def repoURL = url
	echo repoURL
}

def checkoutRepo(string branchName){
	checkout([$class             : 'GitSCM', 
			   branches          : [[name: + 'branchName']], 
			   userRemoteConfigs : [[url: + getRepoURL.repoURL ]]
	])
}
