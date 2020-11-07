package monstrag.stonks

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Stonk(
		var cost: Int,
		var category: String?,
		var name: String?,
		var addedAt: LocalDateTime = LocalDateTime.now(),
		@Id @GeneratedValue var id: Long? = null
) {
	fun render(): RenderedStonk = RenderedStonk(
			id.toString(),
			name ?: "Покупка #${id}",
			category.toString(),
			cost.formatAsCost(),
			addedAt.format()
	)
}

data class RenderedStonk(
		var id: String,
		var name: String,
		var category: String,
		var cost: String,
		val addedAt: String)