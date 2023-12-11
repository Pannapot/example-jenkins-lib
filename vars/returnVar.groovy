def call(String name = 'User') {
		
		def test = ${name}
		sh "echo ${test}"
		return test
}