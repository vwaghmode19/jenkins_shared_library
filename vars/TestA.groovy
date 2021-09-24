class TestA{
  void getSource(){
    //root.checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]])
    
    checkout(
    scm: [
      $class: 'GitSCM',
      branches: [[name: "main"]],
      extensions: scmExtensions,
      userRemoteConfigs: [[
        credentialsId: "vwaghmode19-github",
        name: 'origin',
        url: "git@github.com:vwaghmode19/ansible.git"
      ]]
    ]
  )
  }
}
