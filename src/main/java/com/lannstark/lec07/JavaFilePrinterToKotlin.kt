package com.lannstark.lec07

import java.io.BufferedReader
import java.io.FileReader

class JavaFilePrinterToKotlin {

    /**
     * Kotlin's exception is all unchecked
     */

    fun readFile(path: String) {
        val reader = BufferedReader(FileReader(path))
        println(reader.readLine())
    }

    // try-with-resource
    fun readFileWhenUsingTryWithResource(path: String) {
        BufferedReader(FileReader(path)).use {
            println(it.readLine())
        }
    }
}