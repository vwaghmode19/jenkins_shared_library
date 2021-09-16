@NonCPS
void prepareInfra(String infraNode, String repoURL, String repoBranch) {
    node(infraNode) {
        stage('Checkout infra') {
            checkout changelog: true, poll: true, scm: [
                    $class                           : 'GitSCM',
                    branches                         : [[name: repoBranch]],
                    doGenerateSubmoduleConfigurations: false,
                    userRemoteConfigs                : [[credentialsId: 'vwaghmode19-github-account', url: repoURL]]]
        }
    }
}
