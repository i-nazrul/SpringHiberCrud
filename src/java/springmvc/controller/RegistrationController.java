/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmvc.controller;

import springmvc.model.User;
import springmvc.service.UserService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class RegistrationController {

    @Autowired
    UserService userService;
    
    @RequestMapping("/registration")
    public String listUser(Map<String, Object> map) {
        map.put("user", new User());
        return "registration";
    }
    
    @RequestMapping(value = "/user/add", method = RequestMethod.POST)
    public String addBook(@ModelAttribute("user") User user, BindingResult result) {
            userService.addUser(user);

        return "redirect:/registration";
    }
    

}
