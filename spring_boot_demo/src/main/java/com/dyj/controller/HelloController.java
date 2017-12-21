/**
 * Baifubao.com,Inc.
 * Copyright (c) 2017-2018 All Rights Reserved.
 */
package com.dyj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * a little description
 *
 * @author duanyuejiao
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello() {
        return "hello, spring boot!";
    }
}
