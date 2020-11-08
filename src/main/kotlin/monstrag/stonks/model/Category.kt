package monstrag.stonks.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Category(
        var name: String,
        @Id @GeneratedValue var id: Long? = null
) {
    constructor (name: String): this(name, null)
    override fun toString(): String {
        return this.name
    }
}