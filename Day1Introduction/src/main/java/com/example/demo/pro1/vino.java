package com.example.demo.pro1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class vino {
	@RequestMapping("/divi")
	@ResponseBody
	public String name()
	{
		return "Welcome Vino";
	}

}
