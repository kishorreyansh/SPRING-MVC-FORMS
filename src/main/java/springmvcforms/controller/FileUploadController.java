package springmvcforms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	//value and path both are same any thing we can mention
	@RequestMapping(value="/uploadimage",method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile") MultipartFile file) {
		System.out.println("File Upload Handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		
		return "fileformsuccess";
	}

}
