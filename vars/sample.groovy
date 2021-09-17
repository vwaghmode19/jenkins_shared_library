class sample {
	def clone(Script scriptRef, String repoURL, String branchName, String gitCredentialsId){
		scriptRef.checkout([
			$class: 'GitSCM',
			branches: [[name: branchName]],
			userRemoteConfigs: [[credentialsId: gitCredentialsId, url: repoURL]]
		])
	}
}
