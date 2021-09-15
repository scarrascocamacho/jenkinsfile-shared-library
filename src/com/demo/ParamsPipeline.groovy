import org.jenkinsci.plugins.*

String parm1
Boolean parm2
String parm3

ParamsPipeline withParm1(String parm1) {
    this.parm1 = parm1
    return this
}

ParamsPipeline withParm2(Boolean parm2) {
    this.parm2 = parm2
    return this
}

ParamsPipeline withParm3(String parm3) {
    this.parm3 = parm3
    return this
}

def execute() {
    pipeline {
        stage("Setup environment") {
            echo "Parameter: ${parm1}"
        }
        stage("Should execute action: ${parm2}") {
            if (parm2) {
                echo "Executing action as stated by parm2: ${parm2}"
            }
        }
        stage("Verify state") {
            echo "Executing ${parm3}"
        }
    }
}

return this