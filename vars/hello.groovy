def sayHello(String name = 'human') {
  node('master'){
	stage("Say Hello"){
	echo "Hello, ${name}."
	}
  }
}
