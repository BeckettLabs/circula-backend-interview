package com.circula.interview.api.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld2Controller {

    @GetMapping("/hello-world2")
    public String helloWorld() {
        return "Hello World!";
    }
}
