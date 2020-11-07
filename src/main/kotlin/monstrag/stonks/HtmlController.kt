package monstrag.stonks

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController(private val repository: StonkRepository) {

	@GetMapping("/")
	fun dashboard(model: Model): String {
		model["title"] = "Покупки"
		model["stonks"] = repository.findAllByOrderByAddedAtDesc().map { it.render() }
		return "dashboard"
	}
}
