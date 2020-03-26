package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;
/*
 * RequestMapping
 * Class + Method
 */

@Controller
@RequestMapping("/user")
public class UserController {
	
//	@Autowired
//	UserRepository userRepository;
	
	@RequestMapping(value = {"/join", "/j"}, method = RequestMethod.GET)
	public String join() {
		return "join";
	}
	
	@ResponseBody
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo userVo) {
		System.out.println(userVo);
//		userRepository.insert(userVo);
		return "redirect:/main";
	}
	
//	@RequestMapping(value = "/join", method = RequestMethod.POST)
//	public String join(String name, String email) {
//		System.out.println(name + " : " + email);
//		return "redirect:/main";
//	}
	
	@ResponseBody
	@RequestMapping(value = "/update")
	public String update(@RequestParam("n") String name) {
		/*
		 * 만약 n이라는 이름으로 파라미터가 없는경우 400 Bad Request 오루 발생
		 */
		System.out.println(name);
		return "UserController:join";
	}

	@ResponseBody
	@RequestMapping(value = "/update2")
	public String update2(
			@RequestParam(value = "n", required = true, defaultValue="") String name,
			@RequestParam(value = "a", required = true, defaultValue="0") int age) {
		System.out.println("---" + name + "--" + age);
		return "UserController:join";
	}
}
