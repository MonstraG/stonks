package monstrag.stonks

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class StonksConfig {

    @Bean
    fun databaseInitializer(stonkRepository: StonkRepository) = ApplicationRunner {
	}
}
