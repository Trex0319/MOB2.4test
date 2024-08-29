package com.example.mob.core.util

import com.example.mob.core.utils.Calc
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertTrue
import org.junit.Test

class CalcTest {
    @Test
    fun `2 + 2 should return 4`() {
        assertEquals(Calc.add(2,2),4)
    }

    @Test
    fun `0 + 1 should return 1`() {
        assertEquals(Calc.add(0,1), 1)
    }
}