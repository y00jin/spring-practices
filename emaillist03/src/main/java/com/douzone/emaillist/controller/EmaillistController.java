package com.douzone.emaillist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.emaillist.repository.EmaillistRepository;
import com.douzone.emaillist.vo.EmaillistVo;

@Controller
public class EmaillistController {
	
	@Autowired
	private EmaillistRepository emaillistRepository; 
	
//	@ResponseBody
	@RequestMapping("")
	public String index(Model model) {
		
		List<EmaillistVo> list = emaillistRepository.findAll();
		model.addAttribute("list", list);

		return "/WEB-INF/views/index.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add() {
		return "/WEB-INF/views/add.jsp";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(EmaillistVo emaillistVo) {
		emaillistRepository.insert(emaillistVo);
		return "redirect:/";
	}
	
}
