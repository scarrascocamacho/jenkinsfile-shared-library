#!/usr/bin/env groovy

def call(env){
    def pipelineName;

    if(env.APP_TYPE == 'test'){
        pipelineName = 'pipelineForTest'
    } else if (env.APP_TYPE == 'demo') {
        pipelineName = 'pipelineForDemo'
    } else if (env.APP_TYPE == 'params') {
        pipelineName = 'pipelineForParams'
    }

    return pipelineName
}