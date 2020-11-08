package monstrag.stonks

import monstrag.stonks.model.Stonk
import org.springframework.data.repository.CrudRepository

interface StonkRepository : CrudRepository<Stonk, Long> {
	fun findTop5ByOrderByAddedAtDesc(): Iterable<Stonk>
	fun findAllByOrderByAddedAtDesc(): Iterable<Stonk>
}
