#!/usr/bin/env groovy
def call(config){
    pipeline{
        // Se ejecuta en cualquier agente libre
        agent any

        stages {
            stage('Demo') {
                steps {
                    echo 'Hello, world'
                    sayHello 'Santi'

                    echo 'The value of foo is : ' + GlobalVars.foo

                    script {
                        def person = new SampleClass()
                        person.age = 21
                        person.increaseAge(10)
                        echo 'Incremented age, is now : ' + person.age
                    }
                }
            }
        }
    }
}