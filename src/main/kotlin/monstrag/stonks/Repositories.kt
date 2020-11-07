package monstrag.stonks

import org.springframework.data.repository.CrudRepository

interface StonkRepository : CrudRepository<Stonk, Long> {
	fun findAllByOrderByAddedAtDesc(): Iterable<Stonk>
}
