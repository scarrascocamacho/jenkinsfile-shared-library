#!/usr/bin/env groovy
def call(config){
    pipeline{
        // Se ejecuta en cualquier agente libre
        agent any

        stages {
            stage('Test Stage') {
                steps {
                    script {
                        // Espera de 5 minutos e imprime en el log el mensaje!
                        timeout(time: 5, unit: 'MINUTES') {
                            input 'Pipeline Executing!'
                        }
                        println "Pipeline ejecutado!"
                    }
                }
            }
        }
    }
}