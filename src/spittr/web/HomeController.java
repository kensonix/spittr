package spittr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/")
/*
*���еķ���ӳ�䵽����·����GET����
 */
//@RequestMapping({"/","/homePage"})
public class HomeController {
//	@RequestMapping(value="/", method=GET)
	@RequestMapping(method=GET)
	public String home(){
		return "home";
	}
}
