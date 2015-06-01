package org.sample.spring.boot.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	static final Logger LOG = LoggerFactory.getLogger(MainController.class);

	@RequestMapping("/")
	String home() {
		return "main";
	}

	@RequestMapping("/link")
	String links() {
		return "result";
	}

}
