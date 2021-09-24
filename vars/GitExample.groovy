def checkoutGitRepository(path, url, branch, credentialsId = null, poll = true, timeout = 10, depth = 0, reference = ''){
    def branch_name = reference ? 'FETCH_HEAD' : "*/${branch}"
    dir(path) {
        checkout(
            changelog:true,
            poll: poll,
            scm: [
                $class: 'GitSCM',
                branches: [[name: branch_name]],
            doGenerateSubmoduleConfigurations: false,
            extensions: [
                [$class: 'CheckoutOption', timeout: timeout],
                [$class: 'CloneOption', depth: depth, noTags: false, shallow: depth > 0, timeout: timeout]],
            submoduleCfg: [],
            userRemoteConfigs: [[url: url, credentialsId: credentialsId, refspec: reference]]]
        )
        sh(returnStdout: true, script: 'git rev-parse HEAD').trim()
    }
}
