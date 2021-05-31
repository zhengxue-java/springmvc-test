package com.zhengxue.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能描述： HelloWorld
 * 开发人员： zhengxue
 * 创建日期： 2021-05-28
 */
@Controller
public class HelloWorld {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("success");
        System.out.println("test");
        return "success";
    }
}
