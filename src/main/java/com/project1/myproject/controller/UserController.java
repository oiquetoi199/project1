package com.project1.myproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project1.myproject.domain.User;
import com.project1.myproject.repository.UserRepository;
import com.project1.myproject.service.UserService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;

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
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/")
    public String getHomePage(Model model) {
        String test = this.userService.handle();
        model.addAttribute("truong", test);
        return "index";
    }

    @RequestMapping("/create")
    public String getUserPage(Model model) {
        model.addAttribute("user", new User());
        return "admin/user/create";
    }

    @PostMapping("/create1")
    public String createUser(@ModelAttribute User user, Model model) {
        model.addAttribute("user", user);
        System.out.println(user.getFullName());
        this.userService.saveUser(user);
        return "admin/user/result";
    }

}
