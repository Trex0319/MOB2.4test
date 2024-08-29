package com.example.mob.core.utils

//object ValidationUtil {
//
//    fun validateEmail(email: String): Boolean {
//        return email.contains("@") &&
//                email.contains(".") &&
//                !email.contains(",") &&
//                !email.contains("$")
//    }
//}

object ValidationUtil {

    fun validateEmail(email: String): Boolean {
        val regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z0-9-.]+$".toRegex()
        return email.matches(regex)
    }
}
