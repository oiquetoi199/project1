package com.project1.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.myproject.service.UserService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// @RestController
// public class UserControler {

//     private UserService userService;

//     public UserControler(UserService userService) {
//         this.userService = userService;
//     }

//     @RequestMapping("/")
//     public String getHomePage() {
//         return this.userService.handle();
//     }

// }

@Controller
public class UserControler {

    private UserService userService;

    public UserControler(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handle();
        model.addAttribute("truong", test);
        return "index";
    }

    @RequestMapping("/create")
    public String getUserPage(Model model) {
        return "admin/user/create";
    }

    @RequestMapping(value = "/admin/user/create1", method = RequestMethod.POST)
    public String createUser(Model model) {
        System.out.println("Da chay");
        return "index";
    }

}
