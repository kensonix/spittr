package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/")
/*
*类中的方法映射到两个路径的GET请求
 */
//@RequestMapping({"/","/homePage"})
public class HomeController {
//	@RequestMapping(value="/", method=GET)
	@RequestMapping(method=GET)
	public String home(){
		return "home";
	}
}
