def getSource(String branchName, String credsID, String repoURL) {
  System.out.println("Checking out the code using git module")
  git branch: "${branchName}", credentialsId: "${credsID}", url: "${repoURL}"
  
  System.out.println("Checking out the code using checkout module")
  checkout([$class: 'GitSCM',
              branches: [[name: 'main']],
              extensions: [],
              userRemoteConfigs: [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]])
}

return this
