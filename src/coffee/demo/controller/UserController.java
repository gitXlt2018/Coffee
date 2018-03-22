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
		//1.�ж���֤���Ƿ���ȷ,��ͨ������loginҳ�棬����ʾ
		if(!inputCode.equals(session.getAttribute("numrand"))) {			
			mv.addObject("errorMsg", "��֤�벻��ȷ��");
			mv.setViewName("login");
			return mv;
		}
		//2.�û�����������֤
		Users loginUser=userService.login(username, password);
		if(loginUser!=null) {
			//�ɹ�
			session.setAttribute("user",loginUser);
			//��¼�ɹ���
			mv.setViewName("userIndex");
			return mv;
		}else {
			//ʧ��
			mv.addObject("errorMsg","�û��������벻��ȷ");
			mv.setViewName("login");
			return mv;
		}
		
	}
	
	
	//ע��      @ModelAttribute("registerUser")��ҳ�������ݵĻ���
	
	@RequestMapping("/register")     //@Validated��BindingResult�ɶԳ��֣�BindingResult������ں���
	public String register(Model model,@ModelAttribute("registerUser") @Validated Users users,BindingResult bindingResult) {
		//�ڵ���ҵ������ӷ���ʱ������������֤
		if(bindingResult.hasErrors()) {
			//��ȡ�������ʾ
			List<FieldError> list=bindingResult.getFieldErrors();
			for (FieldError fieldError : list) {
				model.addAttribute(fieldError.getField(),fieldError.getDefaultMessage());
			}
			
			return "register";
		}
		//�û����յ����
		userService.addUser(users);
		return "login";
	}
	
	
	
	//ע���û�
		@RequestMapping("/logout")
		public String logout(HttpSession session) {
			session.invalidate();
			return "login";
		}
	
	
	
	
	
	
	
	
	

}
