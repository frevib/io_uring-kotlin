package iouring

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


internal class IOuringSetupTest {


    @Test
    fun ioUringInit() {
        val ioUringSetup = IOuringSetup().ioUringQueueInit()
        Assertions.assertEquals(0, ioUringSetup)

//        Assertions.assertEquals()

    }
}