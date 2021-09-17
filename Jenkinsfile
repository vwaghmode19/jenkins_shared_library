// @Library('jenkins_shared_library') _

// // sayHello(String name = 'human') . Runs on 'Master' node
// //hello.sayHello('Vikas')     

// // checkout(String node, String repoURL, String branchName, String credentialsId)
// checkout.checkout("master","git_url","main","vwaghmode19-github")


@Library('jenkins_shared_library') _
//import org.mycompany.pipeline
// sayHello(String name = 'human') . Runs on 'Master' node

node('master'){
    stage('hi'){
      shared_Methods.clone(this, "git@github.com:vwaghmode19/jenkins_shared_library.git", "main", "vwaghmode19-github")
    }
    
}
