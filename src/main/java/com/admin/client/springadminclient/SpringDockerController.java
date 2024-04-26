package com.admin.client.springadminclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringDockerController {

	@Value("${spring.application.name}")
	private String applicationName;

	private static final Logger log = LoggerFactory.getLogger(SpringDockerController.class);

	@RequestMapping(value = "/inquiry", method = RequestMethod.GET)
	public @ResponseBody String registerEmployeeMap() {
		log.info(applicationName);
		log.error(applicationName);
		return "HelloWorld";
	}
}
