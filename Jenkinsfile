@Library('jenkins_shared_library') _

node('master') {
    
    stage('sayHello') {
        hello('Vikas')
    }
    
    stage('Checkout'){
        deployActions.infraCheckout()
    }
}
