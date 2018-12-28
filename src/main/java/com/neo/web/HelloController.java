package com.neo.web;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello")
	public String hello(Locale locale, Model model) {
		return "Hello World";
	}
    
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        return session.getId();
    }


    public static void main(String[] args) {
        Map<String,String> abc = new HashMap<>();
        abc.put("abc","1234");
        Map<String,String> cbc = new HashMap<>();
        cbc.put("abc","1234");

    }


}