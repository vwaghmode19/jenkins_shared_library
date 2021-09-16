void infraCheckout() {
    //checkout scm
    checkout changelog: true, poll: true, scm: [
            $class                           : 'GitSCM',
            extensions                       : [],
            branches                         : [[name: 'main']],
            doGenerateSubmoduleConfigurations: false,
            userRemoteConfigs                : [[credentialsId: 'vwaghmode19-github-account', url: 'git@github.com:vwaghmode19/jenkins_shared_library.git']]]
}

