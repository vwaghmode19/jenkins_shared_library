@NonCPS
def checkOut(){
    def LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
  
        // Add mappings using put method
        lhm.put("git@github.com:vwaghmode19/jenkins_shared_library.git", "main");
		lhm.checkout([
            $class: 'GitSCM', 
            branches: [[name: "${branch}"]], 
            userRemoteConfigs: [[
                credentialsId: "${GITHUB_CREDENTIALS_ID}", 
                url: "${repo}"
            ]]
        ])
}
