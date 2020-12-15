package com.shaun.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import javax.servlet.http.HttpSession;



import java.util.Date;

@Controller

public class MyController {
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String success(@RequestParam(value = "code")String code) {
		if(code.equals("bushido")) {
			return "redirect:/success";
		} else {
			return "redirect:createError";
		}
	}
	
	@RequestMapping("/success")
	public String displaySecretPage() {
		return "success.jsp";
	}
	
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "The Code is Invalid");
		return "redirect:/";
	}
}
