package com.prohm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prohm.entity.Dr;
import com.prohm.services.Drservices;

@Controller
public class Drcontroller {
	@Autowired
	private Drservices Dr;
	
@RequestMapping("/doctor")//http:localhost:8080/doctor
public String show()
{
	return "dr";//jsp file name
}
@RequestMapping("/sdoctor")
public String  savedata(Dr v) {
	
	Dr.savedata(v);
	
	return "dr";
	
}
}
