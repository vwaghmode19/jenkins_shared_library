@Library('jenkins_shared_library') _

node('master'){
    stage('Code Checkout'){
        sample.clone(this, "git@github.com:vwaghmode19/ansible.git", "main", "vwaghmode19-github")
    }   
}
