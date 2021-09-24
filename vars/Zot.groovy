def checkOutFrom(String branchName, String credsID, String repoName) {
  //git url: "git@github.com:vwaghmode19/${repo}"
  git branch: "${branchName}", credentialsId: "${credsID}", url: "git@github.com:vwaghmode19/${repoName}"
}

return this
