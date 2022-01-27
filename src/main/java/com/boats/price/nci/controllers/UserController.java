package com.boats.price.nci.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.boats.price.nci.entities.User;
import com.boats.price.nci.repo.UserRepository;








@Controller
public class UserController {

//	@Autowired
//	SecurityService securityService;

	@Autowired
	private UserRepository userRepository;

//	@Autowired
//	private BCryptPasswordEncoder encoder;

	@RequestMapping("/showReg")
	public String showRegistrationPage() {

		return "registerUser";
	}

	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("confirmPassword") String confirmPassword, @ModelAttribute("user") User user,
			ModelMap modelMapd) {

		if (userRepository.findByEmail(email) == null) {
			if (password != null && confirmPassword != null && password.equals(confirmPassword)) {
//		user.setPassword(encoder.encode(user.getPassword()));
				userRepository.save(user);
				return "login";
			} else {
				modelMapd.addAttribute("msg", "Passwords not indentical!");
				return "registerUser";
			}
		} else {
			modelMapd.addAttribute("msg", "Username already used!");
			return "registerUser";
		}

	}

	@RequestMapping("/showLogin")
	public String showLoginPage() {

		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap modelMap) {
		User test = userRepository.findByEmail(email);
		if (test == null) {
			modelMap.addAttribute("msg", "Invalid User Name/Password Combination. Please Try Again!");
			return "login";
		} else {
			if (test.getPassword()!=null && test.getPassword().equals(password)) {
				return "createBoat";
			} else {
				modelMap.addAttribute("msg", "Invalid User Name/Password Combination. Please Try Again!");
				return "login";
			}
		}
	}
}
