package com.exam;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	List<Product> addtocartList=new  ArrayList<>();
	List<Product> pList=new  ArrayList<>();
	@RequestMapping(value = "/shop")
	public String home(Model m) {
		ProductDa d = new ProductDa();
		pList = d.allProduct();
		m.addAttribute("products", pList);
		return "shop";
	}

	@RequestMapping(value = "/addtocart")
	public String addtocart(@ModelAttribute() Product p,Model m) {
		ProductDa d = new ProductDa();
		addtocartList.add(p);
		m.addAttribute("addtocartsize", addtocartList.size());
		pList = d.allProduct();
		m.addAttribute("products", pList);
		return "shop";
	}
	
	@RequestMapping(value = "/addtocartpage")
	public String addtocartpage(Model m) {
		m.addAttribute("addtocartlist", addtocartList);
		return "addtocartpage";
	}
}
