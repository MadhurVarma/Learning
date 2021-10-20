package com.example.SpringMVC.Boot;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController1 {

	@RequestMapping("/")
	public String home() {
		System.out.println("Home Controller 1 Page Requested");
		return "index";
	}
    //this is modelattribue in method
	@ModelAttribute
	public void modeldata(Model m)
	{
		m.addAttribute("name","Any Coder");
	}
	//@RequestMapping("add")
	/*
	 * Working code below but commented to see another approach
	 */
	/*public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");
		int num3 = i + j;

		mv.addObject("num3", num3);
		System.out.println("MV Add");

		return mv;

	}
	*/
	// New approach below works with MOdel and ModelMap
	@RequestMapping("add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, Model m) 
	{
		int num3 = i + j;
		 m.addAttribute("num3", num3);
		return "result";

	}
	//Working Code below but  commented to try another approach
	//@RequestMapping("addcoder")
	/*public String add(@RequestParam("cid") int i, @RequestParam("cname") String j, Model m) 
	{
		Coder c =new Coder();
		c.setcid(i);
		c.setcname(j);
		m.addAttribute("coder",c);
		
		return "result2";

	}
	*/
	//Working Code below but  commented to try another approach
	//@RequestMapping("addcoder")
/*	public String add(Coder c, Model m) 
	{
		m.addAttribute("coder",c);
		
		return "result2";

	}
	*/
	@RequestMapping("addcoder")
	public String add(Coder c) 
	{
	
		return "result2";

	}
}
