@Library('jenkins_shared_library') _

log.info 'Starting'
def z = new SharedMethods()

// sayHello(String nodeName, String name)
z.sayHello('master', 'Vikas')   

// getSource(String nodeName, String branchName, String credsID, String repoURL)
z.getSource('master', 'main', 'vwaghmode19-github', 'git@github.com:vwaghmode19/jenkins_shared_library.git')
