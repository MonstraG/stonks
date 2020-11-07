package monstrag.stonks

import org.springframework.http.HttpStatus.*
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/stonk")
class StonkController(private val repository: StonkRepository) {

	@GetMapping("/")
	fun findAll() = repository.findAllByOrderByAddedAtDesc()

	@GetMapping("/{id}")
	fun findOne(@PathVariable id: Long) =
			repository.findById(id).unwrap()?.render() ?: throw ResponseStatusException(NOT_FOUND, "This stonk doesn't exist")

	@PostMapping("/add")
	fun add(@RequestBody stonk: Stonk) = repository.save(stonk)
}
