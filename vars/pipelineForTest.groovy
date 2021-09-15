#!/usr/bin/env groovy
def call(config){
    pipeline{
        // Se ejecuta en cualquier agente libre
        agent any

        stages {
            stage('Test Stage') {
                steps {
                    script {
                        // Espera de 1 minuto e imprime en el log el mensaje!
                        timeout(time: 1, unit: 'MINUTES') {
                            input 'Pipeline Executing!'
                        }
                        println "Pipeline ejecutado!"
                    }
                }
            }
        }
    }
}