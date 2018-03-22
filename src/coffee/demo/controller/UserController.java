package coffee.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import coffee.demo.service.UserService;
import coffee.demo.pojo.Users;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public ModelAndView login(String username,String password,String inputCode,HttpSession session) {
		ModelAndView mv=new ModelAndView();
		//1.判断验证码是否正确,不通过返回login页面，并提示
		if(!inputCode.equals(session.getAttribute("numrand"))) {			
			mv.addObject("errorMsg", "验证码不正确！");
			mv.setViewName("login");
			return mv;
		}
		//2.用户名和密码验证
		Users loginUser=userService.login(username, password);
		if(loginUser!=null) {
			//成功
			session.setAttribute("user",loginUser);
			//登录成功后，
			mv.setViewName("userIndex");
			return mv;
		}else {
			//失败
			mv.addObject("errorMsg","用户名或密码不正确");
			mv.setViewName("login");
			return mv;
		}
		
	}
	
	
	//注册      @ModelAttribute("registerUser")在页面做数据的回显
	
	@RequestMapping("/register")     //@Validated和BindingResult成对出现，BindingResult必须放在后面
	public String register(Model model,@ModelAttribute("registerUser") @Validated Users users,BindingResult bindingResult) {
		//在调用业务类添加方法时，先做数据验证
		if(bindingResult.hasErrors()) {
			//提取报错的提示
			List<FieldError> list=bindingResult.getFieldErrors();
			for (FieldError fieldError : list) {
				model.addAttribute(fieldError.getField(),fieldError.getDefaultMessage());
			}
			
			return "register";
		}
		//用户最终的添加
		userService.addUser(users);
		return "login";
	}
	
	
	
	//注销用户
		@RequestMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "login";
		}
	
	
	
	
	
	
	
	
	

}
