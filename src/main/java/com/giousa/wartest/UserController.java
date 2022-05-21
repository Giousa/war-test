package com.giousa.wartest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {


    /**
     * http://localhost:8080/user/getUserById?id=1
     */
    @GetMapping("getUserById")
    public String getId(@RequestParam("id") Long id) {
        return "you select id =【" + id + "】 user";
    }

    /**
     * http://localhost:8080/user/sayGet
     */
    @GetMapping("sayGet")
    public String sayGet() {
        return "you say Get";
    }

    /**
     * http://localhost:8080/user/sayHello?name=不笑猫
     */
    @PostMapping("sayHello")
    public String sayHello(@RequestParam("name") String name) {

        return "姓名: 【" + name + "】： sayHello";
    }

    /**
     * http://localhost:8080/user/sayGet
     */
    @PostMapping("sayPost")
    public String sayPost() {
        return "you say Post";
    }
}
