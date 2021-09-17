class sample {
	def clone(String ScriptRef, String gitURLString, String branchID, String gitUserID){
		ScriptRef.checkout([
				$class: 'GitSCM',
				branches: [[name: branchID]],
				doGenerateSubmoduleConfigurations: false,
				extensions: [[$class: 'CleanCheckout']],
				submoduleCfg: [],
				userRemoteConfigs: [[credentialsId: gitUserID, url: gitURLString]]
		])
	}
}
