package spittr.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import spittr.Spittle;
import spittr.data.SpittleRepository;
@Controller
@RequestMapping("/spittles")
public class SpittleController {
//	private static final String MAX_LONG_AS_STRING = Long.toString(Long.MAX_VALUE);
	private SpittleRepository spittleRepository;
	@Autowired
	public SpittleController(SpittleRepository mockRepository) {
		this.spittleRepository = mockRepository;
	}
	@RequestMapping(method=RequestMethod.GET)
	public String Spittles(Model model){
//		System.out.println("test");
		model.addAttribute(
				spittleRepository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Spittle> spittles(
			@RequestParam (value="max",defaultValue= "29800") long max,
			@RequestParam(value="count",defaultValue="20")int count){
		return spittleRepository.findSpittles(max,count);
	}

}
