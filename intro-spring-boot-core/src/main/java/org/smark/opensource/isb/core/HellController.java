package org.smark.opensource.isb.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/hello")
@Controller
public class HellController {

	@ResponseBody
	@RequestMapping("hi")
	public Object hello() {
		return "Hello";
	}
}
