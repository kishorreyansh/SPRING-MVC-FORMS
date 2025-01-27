package springmvcforms.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Home Invoked");
		//Null Pointer Exception Code
		/*String s = null;
		System.out.println(s.length());*/
		return "home";
	}
	
	@RequestMapping("/user/{userId}")
	public String userDetails(@PathVariable("userId") int userId) {
		System.out.println("Implementing Using Path Variable");
		System.out.println("Path Variable userId: "+userId);
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		System.out.println("Search Invoked");
		RedirectView redirectView = new RedirectView();
		if(query == null || query.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}
		
		String url="https://google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String nullExceptionHandler(Model m) {
		System.out.println("Null Pointer Exception Invoked");
		m.addAttribute("msg", "Null Pointer Exception");
		return "nullpage";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String exceptionHandler(Model m) {
		System.out.println("Exception Invoked");
		m.addAttribute("msg", "Exception has occured");
		return "nullpage";
	}*/

}
