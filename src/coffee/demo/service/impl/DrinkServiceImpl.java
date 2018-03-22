package coffee.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coffee.demo.mapper.DrinkMapper;
import coffee.demo.pojo.Drink;
import coffee.demo.pojo.DrinkExample;
import coffee.demo.service.DrinkService;

@Service
public class DrinkServiceImpl implements DrinkService {
	@Autowired
	private DrinkMapper drinkMapper;

	@Override
	public List<Drink> queryDrink() {
		DrinkExample example=new DrinkExample();
		List<Drink> drinkList=drinkMapper.selectByExample(example);
		return drinkList;
	}

}
