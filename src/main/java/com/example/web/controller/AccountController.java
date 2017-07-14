package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by zhang on 2017/6/30.
 */
@Controller
public class AccountController {
    @RequestMapping(value = "/account")
    public ModelAndView account() {
        return new ModelAndView("account");
    }
}
