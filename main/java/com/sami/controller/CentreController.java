package com.sami.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/centre")
public class CentreController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
