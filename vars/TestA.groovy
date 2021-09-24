class TestA{
  void getSource(Script root){
    root.checkout(scm [$class: 'GitSCM', branches: [[name: 'main']],userRemoteConfigs: [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/ansible.git']]])
  }
}
