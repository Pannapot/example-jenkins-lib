def call(String name = 'User') {
		
		def test = ${name}
		echo "Welcome, ${name}."
		return test
}