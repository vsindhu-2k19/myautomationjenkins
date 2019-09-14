freeStyleJob('Task2') {
    logRotator(-1, 10)
    jdk('Java 8')
    scm {
        git {
            remote {
                name('task1')
                url('git@github.com:vsindhu-2k19/myautomationjenkins.git')
            }
       }
}
