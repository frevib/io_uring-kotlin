package iouring

//import iouring.util.LibraryLoader

class IOuringNativeBindings {

    init {
//        LibraryLoader.loadLibrary("io_uring_kotlin")
        System.loadLibrary("io_uring_kotlin")
    }

    external fun ioUringQueueInit(): Int
    external fun ioUringQueueInitParams(number: Int): Int
}


fun main(args: Array<String>) {
    println(args[0])
    val result = IOuringNativeBindings().ioUringQueueInit()
    val resultParams = IOuringNativeBindings().ioUringQueueInitParams(args[0].toInt())

    println(result)
    println(resultParams)
}