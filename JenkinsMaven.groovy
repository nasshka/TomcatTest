job('First DSL Project1') {
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