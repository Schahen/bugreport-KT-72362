package org.shagen.bugreport.ktUnknown.ui.tests

import kotlin.test.Test
import kotlin.test.assertEquals
import org.shagen.bugreport.ktUnknown.uiTest.api.ping

class UiTests() {
    @Test
    fun pingTest() {
        assertEquals(ping(), 42)
    }
}
