import jenkins.model.*
class SimpleCheckout{
      void getSource(String branchName, String repoCredId, String repoURL){
            echo "Hi There"
                println ("Branch Name:" +branchName +
                                " \n Repo Cred ID:" +repoCredId +
                                " \n Repo URL:" +repoURL )

/*              checkout([$class: 'GitSCM',
                                branches: [[name: 'main']],
                                userRemoteConfigs: [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]])
*/      }
}
