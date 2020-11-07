package monstrag.stonks

import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class StonksConfig {

    @Bean
    fun databaseInitializer(stonkRepository: StonkRepository) = ApplicationRunner {

        stonkRepository.save(Stonk(
				name = "Shoes",
				category = "Footwear",
				cost = 19000
		))
		stonkRepository.save(Stonk(
				name = "Nikes",
				category = "Footwear",
				cost = 35000
		))
		stonkRepository.save(Stonk(
				name = "Matches",
				cost = 470,
				category = "Housestuff"
		))
	}
}
