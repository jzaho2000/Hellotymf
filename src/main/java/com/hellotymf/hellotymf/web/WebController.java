package com.hellotymf.hellotymf.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	
	@RequestMapping("/hello")
	public void returnHello(
			@RequestParam(name="name", defaultValue="")String name,
			@RequestParam(name="age", defaultValue="0")int age,
			Model model) {
		model.addAttribute("name",name);
		model.addAttribute("age", age);
		//return "hello";
	}
}
