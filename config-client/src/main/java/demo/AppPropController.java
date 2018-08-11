package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppPropController {
	 
	@Value("${prop1}") String prop1;
	  
	  @GetMapping("/prop-load")
	  public String showPropWord() {
	    return "The property is: " + prop1;
	  }
}
