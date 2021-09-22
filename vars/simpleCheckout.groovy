class SimpleCheckout{
        String branchName
        String repoCredId
        String repoURL

        public static void main(String[] args){
                println ("Executing getSource Function")
        }

        def getSource(String branchName, String repoCredId, String repoURL){
                println ("Branch Name:" +branchName +
                                 "Repo Cred ID:" +repoCredId +
                                 "Repo URL:" +repoURL)

                checkout([$class: 'GitSCM',
                                   branches: [[name: '*/main']],
                                   userRemoteConfigs: [[credentialsId: 'vwaghmode19-github', url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]
                                ])

        }
}
