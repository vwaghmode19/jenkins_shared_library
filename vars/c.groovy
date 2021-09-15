@NonCPS
def vikas(){
	checkout scm: [$class            : 'GitSCM', 
	          branches          : [[name: 'main']], 
                  userRemoteConfigs : [[url: 'https://github.com/vwaghmode19/simple-java-maven-app.git']]
        ]
}
