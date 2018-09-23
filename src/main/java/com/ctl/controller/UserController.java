package com.ctl.controller;
import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ctl.model.UserModel;
import com.ctl.repository.UserInterface;

@Controller
@RestController
@RequestMapping(value = "user/createNewUser")
public class UserController {
	
	@Autowired
	UserInterface userInterface;
	
//	@RequestMapping(method = RequestMethod.GET, value="/AllUser")
//	public List<UserModel> getUserList(){
//		userInterface.findAll();
//	}
	
	@RequestMapping(method = RequestMethod.POST , value="/saveUser")
    public String createUser(@RequestBody UserModel u) {
		userInterface.save(u);
        return "Sucess";
    }
}
