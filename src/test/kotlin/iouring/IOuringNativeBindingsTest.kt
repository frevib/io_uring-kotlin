package iouring


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.assertEquals


internal class IOuringNativeBindingsTest {


    @Test
    fun ioUringQueueInitWithParams_success() {
        val retValue = IOuringNativeBindings().ioUringQueueInitParams(128)
        assertEquals(0, retValue, "expect to be 0")
    }

    @Test
    fun ioUringQueueInitWithParams_failed_negative_ring_size() {
        val retValue = IOuringNativeBindings().ioUringQueueInitParams(-1)
        assertEquals(-1, retValue)
    }

    @Test
    fun ioUringQueueInitWithParams_check_if_IORING_FEAT_FAST_POLL_is_available() {
        val retValue = IOuringNativeBindings().ioUringQueueInitParams(32)
        assertEquals(0, retValue, "expect to be 0")
    }
}