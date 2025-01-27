package springmvcforms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
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
	}

}
