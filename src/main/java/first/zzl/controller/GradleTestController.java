package first.zzl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class GradleTestController {
	@GetMapping("/gradle")
	public String test() {
		return "gradle test";
	}
}
