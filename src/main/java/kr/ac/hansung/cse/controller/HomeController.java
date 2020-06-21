package kr.ac.hansung.cse.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	static Logger logger = LoggerFactory.getLogger(HomeController.class);

	// @GetMapping is a composed annotation that acts as a shortcut for
	// @RequestMapping(value="/", method = RequestMethod.GET).
	//짧게 줄이면 GetMapping으로 쓸 수 o
	//root로 매핑된 매소드
	@GetMapping("/")
	public String home(Model model) {

		logger.info("Info: Calling home( )");
		logger.debug("Debug: Calling home( )");
		logger.trace("trace: Calling home( )");

		//모델에 메세지 넣고 index로 return
		model.addAttribute("message", "hello world");

		//jsp로 넘어가는 것이 아닌 html로 넘어감
		return "index";

	}

}
