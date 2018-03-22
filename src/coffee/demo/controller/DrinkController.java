package coffee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import coffee.demo.pojo.Drink;
import coffee.demo.service.DrinkService;

@Controller
@RequestMapping("/drink")
public class DrinkController {
	
	@Autowired
	private DrinkService drinkService;
	
	@RequestMapping("/queryDrink")
	public ModelAndView queryDrink(){		
		ModelAndView mv=new ModelAndView();		
		List<Drink> list=drinkService.queryDrink();
		mv.addObject("drinkList", list);
		mv.setViewName("userIndex");
		return mv;
		
	}

}
