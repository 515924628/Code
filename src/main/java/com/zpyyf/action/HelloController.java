package com.zpyyf.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Radius on 2015/8/21.
 * controller
 */
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public Object hello() {
//		Map<String, Object> map = new HashMap<String, Object>();
//		map.put("ok","1");
		return "index.html";
	}
}
