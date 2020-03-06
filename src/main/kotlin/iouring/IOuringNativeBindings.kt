package iouring

import iouring.util.LibraryLoader


class IOuringNativeBindings {

    init {
        LibraryLoader.loadLibrary("geit")
    }

    // initialize io_uring
    external fun ioUringQueueInit(): Int

    // initialize io_uring with parameters
    external fun ioUringQueueInitParams(number: Int): Int
}


//fun main(args: Array<String>) {
//    println(args[0])
//    val result = IOuringNativeBindings().ioUringQueueInit()
//    val resultParams = IOuringNativeBindings().ioUringQueueInitParams(args[0].toInt())
//
//    println(result)
//    println(resultParams)
//}