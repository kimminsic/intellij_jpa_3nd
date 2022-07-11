package com.mysite.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sbb")
public class MainController {
    @RequestMapping("/main")
    @ResponseBody
    public String Index(){
        return "안녕하세요";
    }
}
