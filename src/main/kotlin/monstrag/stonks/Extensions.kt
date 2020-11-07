package monstrag.stonks

import java.text.NumberFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter.ofLocalizedDateTime
import java.time.format.FormatStyle.MEDIUM
import java.util.*


fun LocalDateTime.format(): String {
    return this.format(ofLocalizedDateTime(MEDIUM))
}

val locale = Locale("ru", "RU")
val currencyFormatter: NumberFormat = NumberFormat.getCurrencyInstance(locale)
fun Int.formatAsCost(): String {
    return currencyFormatter.format(this / 100.0)
}

fun <T> Optional<T>.unwrap(): T? = orElse(null)