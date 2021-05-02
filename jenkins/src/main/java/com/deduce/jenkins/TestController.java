package com.deduce.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/testforjenkins")
@RestController
public class TestController {

	@GetMapping("/jenkins")
	public String test() {

		return "test is ok";
	}
}
