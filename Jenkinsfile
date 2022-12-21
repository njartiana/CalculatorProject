node {
    stage('clone') {
        git 'https://github.com/njartiana/CalculatorProject.git'
    }
    stage('build') {
        sh 'javac src/BaseCalcule/BaseCalcule.java src/Test/TestCalcule.java src/Main.java' 
    }
    stage('run') {
        sh 'cd src && java Main'
    }
}
