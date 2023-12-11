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
    sh "git clone ${repoUrl} ${workingDir}"
   

    dir(workingDir) {
        sh "ls"
        sh "git checkout ${branch}"
    }

//    sh "git clone ${repoUrl} ${workingDir}"
//    sh "git checkout ${branch}"
//    sh "echo before return"
//    return workingDir
             sh "echo ${workingDir}"
  return workingDir
  }

//   return workingDir
}
