job('First DSL Project') {
    description("Descriere DSL")
    scm {
        git('https://github.com/nasshka/TomcatTest.git', 'main')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }
}