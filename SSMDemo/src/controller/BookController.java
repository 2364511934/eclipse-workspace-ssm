package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import service.BookService;

@Controller
public class BookController {

	@Autowired
	BookService service;
	
	@RequestMapping("/book")
	public String query(Model model){
		model.addAttribute("books", service.queryAll());
		return "show";
	}
}
