package springmvcforms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcforms.model.Student;

@Controller
public class FormController {
	
	@RequestMapping("/complex")
	public String showForm() {
		System.out.println("Show Form Method Invoked");
		return "complexform";
	}
	
	@RequestMapping(path="/handleform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("student") Student student, BindingResult result) {
		if(result.hasErrors()) {
			return "complexform";
		}
		System.out.println("Student Details: "+student);
		System.out.println("Student Address: "+student.getAddress());
		return "complexformsuccess";
	}

}
