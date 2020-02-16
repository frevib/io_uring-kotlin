package iouring

import java.lang.System.loadLibrary

class IOuringSetup {

    init {
//        System.load("/home/max/hdv/source/kotlin/kotlin-io_uring/src/main/kotlin/iouring/libio_uring_kotlin.so")
        loadLibrary("io_uring_kotlin")
    }

    external fun ioUringQueueInit(): Int
}


fun main(args: Array<String>) {
    val result = IOuringSetup().ioUringQueueInit()

    println(result)
}