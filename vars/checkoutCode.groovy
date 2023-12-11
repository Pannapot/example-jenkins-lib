// def call(String repoUrl, String branch){
//    def workingDir = "${env.WORKSPACE}"
//    sh "git clone ${repoUrl} ${workingDir}"
//    sh "git checkout ${branch}"
//    return workingDir
// }


/**
  * Git Clone Repository and Checkout
  *
  * @return scmVars Object
  */
def call(String repoUrl, String branch) {
  stage('Clone repository') {
    scmVars = checkout scm
  }
  return scmVars
}