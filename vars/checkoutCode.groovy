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
   def workingDir = "${env.WORKSPACE}/testgit"
    dir(${workingDir}) {
           sh "git clone ${repoUrl}"
            sh "git checkout ${branch}"
   sh "echo before return"
    }
//    sh "git clone ${repoUrl} ${workingDir}"
//    sh "git checkout ${branch}"
//    sh "echo before return"
//    return workingDir
  }
  return workingDir
//   return workingDir
}
