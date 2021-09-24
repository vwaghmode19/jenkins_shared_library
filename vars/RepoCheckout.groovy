def getSource(String branchName, String credsID, String repoURL) {
//   System.out.println("Checking out the code using git module")
//   git branch: "${branchName}", credentialsId: "${credsID}", url: "${repoURL}"
  
//   System.out.println("Checking out the code using checkout module")
  checkout([$class: 'GitSCM',
              branches: [[name: branchName]],
              extensions: [],
              userRemoteConfigs: [[credentialsId: credsID, url: repoURL]]])
}

return this
