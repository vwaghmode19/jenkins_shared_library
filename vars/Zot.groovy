def checkOutFrom(repo) {
  //git url: "git@github.com:vwaghmode19/${repo}"
  git branch: 'main', credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/ansible.git'
}

return this
