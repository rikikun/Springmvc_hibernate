package com.dtec.template.controller;

import java.security.Principal;

import com.dtec.template.entity.RoleEntity;
import com.dtec.template.entity.UserDetail;
import com.dtec.template.validator.UserValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dtec.template.entity.UserEntity;
import com.dtec.template.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

    @Autowired
    UserValidator userValidator;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal,@ModelAttribute(value = "userEntity")UserEntity userEntity) {
		return "index";
	}

	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String goRegister(@ModelAttribute(value = "userEntity")UserEntity userEntity,BindingResult bindingResult) {
		return "register";
	}

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String doRegister(@ModelAttribute(value = "userEntity")UserEntity userEntity,BindingResult bindingResult,ModelMap map){
        System.out.println(userEntity);
        userValidator.validate(userEntity,bindingResult);
        if(bindingResult.hasErrors()){
            return "register";
        }
        UserDetail userDetail=new UserDetail();
        userDetail.setFirstName("FirstName");
        userDetail.setSurName("Surname");
        userEntity.setUserDetail(userDetail);
        userEntity.setActive(true);
        RoleEntity roleEntity=new RoleEntity();
        roleEntity.setId(1);
        userEntity.setRoleEntity(roleEntity);
        userService.createUser(userEntity);
        map.addAttribute("userEntity",userEntity);
        return "index";
    }

	@RequestMapping(value = "/update/{pageNum}", method = RequestMethod.POST)
	public String getUpdate(
			@ModelAttribute(value = "userEntity") UserEntity userEntity,
			@PathVariable(value = "pageNum") Integer pageNum) {
		userService.updateUser(userEntity);
		return "index_min";
	}

	@RequestMapping(value = "/delete/{pageNum}", method = RequestMethod.POST)
	public String getDelete(
			@ModelAttribute(value = "userEntity") UserEntity userEntity,
			@PathVariable(value = "pageNum") Integer pageNum) {
		userService.deleteUser(userEntity);
		return "index_min";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String firstWelcome(ModelMap model) {
		return "redirect:/welcome";
	}
}
