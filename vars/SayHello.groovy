def SayHello(String name = 'human'){
	node('master'){
		stage('Say Hello'){
			println("Hello " +name)
		}
	}
}
