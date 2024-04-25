package com.jsp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

	   // For only one Object
	
//	@GetMapping("/message")
//	public ModelAndView getMessage()
//	{
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("username","Chandan");       // MODEl
//		mv.setViewName("Home.jsp");           // VIEW
//		
//		return mv;    // Returning Both Model and View Together
//	}
	
	// For multiple Objects
	
	@GetMapping("/sample")
	public ModelAndView fetchMessage()
	{
		ModelAndView mm = new ModelAndView();
		mm.addObject("username","Chandu");
		mm.addObject("ph_No","8971101745");
		mm.addObject("Address","Hegde Nagar");
		mm.setViewName("Home.jsp");
		
		return mm;
	}
}
