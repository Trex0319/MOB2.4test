package com.example.mob.core.util

import com.example.mob.core.utils.ValidationUtil
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class ValidationUtilTest {
    @Test
    fun `validateEmail should return true for a@a,com` () {
        assertTrue(ValidationUtil.validateEmail("a@a.com"))
    }
    @Test
    fun `validateEmail should return false for a@`() {
        assertFalse(ValidationUtil.validateEmail("a@12345"))
    }

    @Test
    fun `validateEmail should return false for a@a,com$`() {
        assertFalse(ValidationUtil.validateEmail("a@a.com$"))
    }
}