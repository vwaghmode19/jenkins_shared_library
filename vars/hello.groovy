def sayHello(String name = 'human') {
  stage("Say Hello"){
    echo "Hello, ${name}."
  }
}
