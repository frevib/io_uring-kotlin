package iouring

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class IOuringNativeBindingsTest {


    @Test
    fun ioUringQueueInit() {
        val retValue = IOuringNativeBindings().ioUringQueueInitParams(2)
        Assertions.assertEquals(0, retValue)
    }
}