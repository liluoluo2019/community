package cn.lll.study.community.controller;/*
 @author 落落-luoluo
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/9/2
*/

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name")String name, Model model) {
        model.addAttribute("name",name);
        return "hello";
    }
}
