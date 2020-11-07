package monstrag.stonks

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
class StonksApplication

fun main(args: Array<String>) {
	runApplication<StonksApplication>(*args)
}
