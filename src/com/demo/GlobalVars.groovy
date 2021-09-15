#!/usr/bin/env groovy
package com.demo

class GlobalVars {
    static String foo = "bar"

    // refer to this in a pipeline using:
    //
    // import com.demo.GlobalVars
    // println GlobalVars.foo
}