package monstrag.stonks

import monstrag.stonks.model.Stonk
import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/stonk")
class StonkController(private val repository: StonkRepository) {

	@GetMapping("/")
	fun findTop5() = repository.findTop5ByOrderByAddedAtDesc()

	@GetMapping("/all")
	fun findAll() = repository.findAllByOrderByAddedAtDesc()

	@GetMapping("/{id}")
	fun findById(@PathVariable id: Long) =
			repository.findById(id).unwrap() ?: throw ResponseStatusException(NOT_FOUND, "This stonk doesn't exist")

	@DeleteMapping("/{id}")
	fun deleteById(@PathVariable id: Long) = repository.deleteById(id)

	@PostMapping("/")
	fun add(@RequestBody stonk: Stonk) = repository.save(stonk)
}
