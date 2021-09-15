def checkout(String repo, String branch = "main"){
    stage("Checkout"){
        checkout([
            $class: 'GitSCM', 
            branches: [[name: "${branch}"]], 
            userRemoteConfigs: [[
                credentialsId: "env.GITHUB_CREDENTIALS_ID", 
                url: "${repo}"
            ]]
        ])
    }
}

