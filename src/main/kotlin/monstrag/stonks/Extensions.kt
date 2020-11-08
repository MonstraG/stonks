package monstrag.stonks

import java.util.*

fun <T> Optional<T>.unwrap(): T? = orElse(null)