package com.mr.controller;

import com.mr.result.ResultVO;
import com.mr.service.UserService;
import com.mr.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("toLogin")
    public String toLogin(){
        return "view/login";
    }


    @RequestMapping("login")
    @ResponseBody
    public ResultVO login(User user){
        ResultVO resultVO= userService.login(user);
        return resultVO;
    }
}
