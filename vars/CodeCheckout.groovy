def CodeCheckout(){
	script{
	    checkout([$class           : 'GitSCM', 
	         branches          : [[name: 'master']], 
                 userRemoteConfigs : [[credentialsId: 'vwaghmode19-github', 
                                url: 'https://github.com/vwaghmode19/simple-java-maven-app.git']]
            ])
	}

}
