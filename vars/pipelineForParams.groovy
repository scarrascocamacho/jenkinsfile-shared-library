#!/usr/bin/env groovy

import com.demo.ParamsPipeline

new ParamsPipeline()
        .withParm1(params.environment)
        .withParm2(params.dryRun)
        .withParm3(params.verifier)
        .execute()