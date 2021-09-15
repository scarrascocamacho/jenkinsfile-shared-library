#!/usr/bin/env groovy

import com.demo.ParamsPipeline

def call(config){
    pipeline{
        // Se ejecuta en cualquier agente libre
        agent any

        stages {
            stage('Params') {
                steps {
                    new TestPipeline()
                            .withParm1(params.environment)
                            .withParm2(params.dryRun)
                            .withParm3(params.verifier)
                            .execute()
                }
            }
        }
    }
}