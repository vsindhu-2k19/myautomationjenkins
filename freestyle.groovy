freeStyleJob('Task2') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        git {
            remote {
                name('freestyle')
                url('git@github.com:vsindhu-2k19/myautomationjenkins.git')
            }
            extensions {
                cleanAfterCheckout()
                relativeTargetDirectory('repo1')
            }
        }
      }
}
