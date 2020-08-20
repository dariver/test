node {
  checkout scm
  emailext body: 'Hello Darío', recipientProviders: [developers()], subject: 'test'
  sh "echo hello"
}
