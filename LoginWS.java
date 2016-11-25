package com.aartek.ws.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.loginVO.LoginVO;

@Controller
public class LoginWS {
	
@RequestMapping(value = "/login", method = RequestMethod.GET)
public ModelAndView getLogin(@RequestParam(required = false) String id,ModelMap model){
	String Id=id;
	 System.out.println("ID is : "+Id);

	LoginVO l=new LoginVO();
	l.setEmail_id("abc");
	l.setPassword("123");
	System.out.println("l is "+l);
		return new ModelAndView("login","object",l);
	
}
}
