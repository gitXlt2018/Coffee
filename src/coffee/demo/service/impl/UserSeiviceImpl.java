package coffee.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coffee.demo.mapper.UsersMapper;
import coffee.demo.pojo.Users;
import coffee.demo.service.UserService;
import coffee.demo.pojo.UsersExample;

@Service
public class UserSeiviceImpl implements UserService {
	
	@Autowired
	private UsersMapper usersMapper;
	
	@Override
	public Users login(String username, String password) {
		
		UsersExample example=new UsersExample();
		UsersExample.Criteria criteria=example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		
		List<Users> list=usersMapper.selectByExample(example);
		if(list!=null && list.size()>0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void addUser(Users users) {
		//普通用户注册，把值设为0
		users.setUsertype(new Short("0"));
		usersMapper.insert(users);
		
		
	}
}
