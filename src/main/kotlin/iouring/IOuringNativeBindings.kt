package iouring

import iouring.util.LibraryLoader


class IOuringNativeBindings {

    init {
        LibraryLoader.loadLibrary("iouring")
    }

    // initialize io_uring
    external fun ioUringQueueInit(): Int

    // initialize io_uring with parameters
    external fun ioUringQueueInitParams(number: Int): Int

    // initialize io_uring with parameters
    external fun ioUringQueueInitParams_IORING_FEAT_FAST_POLL(number: Int): Int
}
