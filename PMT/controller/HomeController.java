package com.PMT.controller;


import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.servlet.ModelAndView; 
import com.PMT.domain.Signup; 
import com.PMT.domain.Login;
import com.PMT.services.SignupService; 

@Controller
public class HomeController {

	@Autowired
	SignupService signupService;
	
	@RequestMapping("/home")
	public ModelAndView home(){
		return new ModelAndView("Home");
	}
	@RequestMapping("/login")
	public ModelAndView login(Model model) {
		model.addAttribute("login", new Login());
		return new ModelAndView("Login");
	}
	@RequestMapping("/signup")
	public ModelAndView signup(@ModelAttribute Signup signup){
		return new ModelAndView("Signup");
	}
	@RequestMapping("/insertIntoPassenger")
	public String insertDataInPassenger(@ModelAttribute Signup signup) {
		if(signup != null)
			signupService.insertData(signup);
		return "redirect:/login";
	}
	@RequestMapping("/AllowLoginToUser")
	public ModelAndView Login() {
		return new ModelAndView("User");
	}
	@RequestMapping("/success")
	public ModelAndView success() {
		return new ModelAndView("Success");
	}
	@RequestMapping("/failure")
	public ModelAndView failure() {
		return new ModelAndView("Failure");
	}
}
