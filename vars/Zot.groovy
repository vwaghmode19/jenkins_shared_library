def checkOutFrom(String branchName, String credsID, String repoURL) {
  git branch: "${branchName}", credentialsId: "${credsID}", url: "${repoURL}"
}

return this
