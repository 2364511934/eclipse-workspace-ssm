package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import entity.User;
import service.UserService;

@Controller
public class UserController implements org.springframework.web.servlet.mvc.Controller {
	@Autowired
	UserService service;
	
	@Override
	@RequestMapping("/login")
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView view = new ModelAndView();
		String user = request.getParameter("user");
		String pwd = request.getParameter("pwd");
		
		List<User> lists = service.queryOne(user, pwd);
		if(lists.isEmpty()) {
			System.out.println("Œ¥’“¥Ú");
		}
		else {
			System.out.println("’“µΩ");
		}
		view.setViewName("forward:book");
		return view;
	}
	
}
