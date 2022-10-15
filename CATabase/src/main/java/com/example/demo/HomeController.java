package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@Autowired
	private CatService catService;
	@Autowired
	private CatRepository catrepo;
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Cat> listCat = catService.ListAllCat();
		model.addAttribute("listCat", listCat);
		System.out.print("Get / ");
		return "index.html";
	}
	
	@GetMapping("/getCats")
	public @ResponseBody Iterable<Cat> ListAllCat() {
		return catrepo.findAll();
	}
	
	@RequestMapping("/newcat")
	public String newcat() {
		return "newcat.html";
	}
	
	@RequestMapping("/newowner")
	public String newOwner() {
		return "newowner.html";
	}
	
}
