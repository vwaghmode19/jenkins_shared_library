class sample {
	def clone(String gitURLString, String branchID, String gitUserID){
		this.checkout([
				$class: 'GitSCM',
				branches: [[name: branchID]],
				doGenerateSubmoduleConfigurations: false,
				extensions: [[$class: 'CleanCheckout']],
				submoduleCfg: [],
				userRemoteConfigs: [[credentialsId: gitUserID, url: gitURLString]]
		])
	}
}
