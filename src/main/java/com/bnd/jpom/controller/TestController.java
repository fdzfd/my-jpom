package com.bnd.jpom.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wangshuai
 * @since: 2020/6/15 15:48
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "from my-jpom";
    }
}
