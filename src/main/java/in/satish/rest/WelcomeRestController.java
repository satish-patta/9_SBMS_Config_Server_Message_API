package in.satish.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {
	@Value("${msg}")
	private String message;

	@GetMapping("/welcome")
	public String getWelcome() {
		return message;
	}
}
