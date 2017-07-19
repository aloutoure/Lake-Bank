package com.toure.project.LakeBank.controllers;

import com.toure.project.LakeBank.models.Data.userDao;
import com.toure.project.LakeBank.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by Alou on 7/7/2017.
 */

@Controller
@RequestMapping(value = "")
public class UserController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "home";
    }

    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String signup(Model model){
        model.addAttribute(new User());
        return "signup";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String signUp(Model model, @ModelAttribute @Valid User user, Errors errors, String verify) {

        if (errors.hasErrors()){

            return "signup";
        }

        if (user.getPassword() != null && verify != null
                && user.getPassword().equals(verify)) {
            model.addAttribute("email", user.getEmail());
            return "index";
        }

        if(! user.getPassword().equals(verify)){
            String errorMessage = "Passwords must match";
            model.addAttribute("errorMessage",errorMessage);
            return "signup";
        }

        return "user-info";
    }

    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public String processUserInfoForm(Model model, @ModelAttribute @Valid User user, Errors errors) {

        if (errors.hasErrors()){
            return "user-info";
        }
//        userDao.save(user);
        return "index";
    }

    @RequestMapping(value = "signin", method = RequestMethod.GET)
    public String signin(Model model){
        model.addAttribute(new User());
        return "signin";
    }

    @RequestMapping(value = "signin", method = RequestMethod.POST)
    public String signIn(Model model, @ModelAttribute @Valid User user, Errors errors){

        if (errors.hasErrors()){
            return "signin";
        }

        model.addAttribute("email", user.getEmail());
        return "index";
    }
}
