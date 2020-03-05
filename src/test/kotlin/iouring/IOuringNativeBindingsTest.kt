package iouring

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class IOuringNativeBindingsTest {


    @Test
    fun ioUringQueueInit() {
        val ioUringSetup = IOuringNativeBindings().ioUringQueueInit()
        Assertions.assertEquals(0, ioUringSetup)

//        Assertions.assertEquals()

    }
}