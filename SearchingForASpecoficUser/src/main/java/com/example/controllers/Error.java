package com.example.controllers;
import org.springframework.boot.autoconfigure.web.servlet.error.AbstractErrorController;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Error extends AbstractErrorController{


	public Error(ErrorAttributes errorAttributes) {
		super(errorAttributes);
		// TODO Auto-generated constructor stub
	}


	@RequestMapping("/exception")
    public String handleError() {
        //do something like logging
        return "exception";
    }

   
    public String getErrorPath() {
        return null;
    }
}
