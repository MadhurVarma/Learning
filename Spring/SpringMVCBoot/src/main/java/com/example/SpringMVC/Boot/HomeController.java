package com.example.SpringMVC.Boot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("Home Controller Page Requested");
		return "index.jsp";
	}

	@RequestMapping("add")
	public String add(HttpServletRequest req) {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));

		int num3 = i + j;

		HttpSession session = req.getSession();

		session.setAttribute("num3", num3);

		return "result.jsp";
	}
}
