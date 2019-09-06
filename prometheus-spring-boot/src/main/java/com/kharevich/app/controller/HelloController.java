package com.kharevich.app.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/rest/{command}/{name}")
    public String index(@PathVariable("name") String name,
                        @PathVariable("command") String command) {
        return String.format("%s from Spring Boot, %s!", command, name);
    }

}
