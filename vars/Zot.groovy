def checkOutFrom(String branchName, String credsID, String repoURL) {
  //git url: "git@github.com:vwaghmode19/${repo}"
  git branch: "${branchName}", credentialsId: "${credsID}", url: "${repoURL}"
}

return this
