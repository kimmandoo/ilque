package com.ilque.data

fun String.toIntArray(): IntArray {
    return this.split(",").map { it.toInt() }.toIntArray()
}
