package org.smark.opensource.isb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/intro")
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public Object sayHello() {
		return "Hello";
	}
	
}
