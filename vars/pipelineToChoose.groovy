#!/usr/bin/env groovy

def call(env){
    def pipelineName;

    if(env.APP_TYPE == 'test'){
        pipelineName = 'pipelineForTest'
    } else if (env.APP_TYPE == 'hello') {
        pipelineName = 'sayHello'
    }

    return pipelineName
}