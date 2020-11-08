package monstrag.stonks.model

import java.time.LocalDateTime
import javax.persistence.*

@Entity
class Stonk(
		var cost: Int,
		@ManyToOne(cascade = [CascadeType.ALL]) var category: Category?,
		var name: String?,
		var addedAt: LocalDateTime = LocalDateTime.now(),
		@Id @GeneratedValue var id: Long? = null
)