package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller     //Controller注解可简单理解为允许该类接收前台传递过来的参数
public class IndedxController {

    @GetMapping("/")
    public String hello(){ return "index"; }


}
