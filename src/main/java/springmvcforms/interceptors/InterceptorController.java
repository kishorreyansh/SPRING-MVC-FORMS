package springmvcforms.interceptors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {
	
	@RequestMapping("/homeinterceptor")
	public String homeinterceptor() {
		System.out.println("Home Interceptor Invoked");
		return "homeinterceptor";
	}
	

	@RequestMapping(value="/handleinterceptor",method=RequestMethod.POST)
	public String handleInterceptor(@RequestParam("textinput") String name, Model model) {
		System.out.println("Handle Interceptor Invoked");
		System.out.println(name);
		model.addAttribute("name", name);
		return "homeinterceptorsuccess";
	}
}
