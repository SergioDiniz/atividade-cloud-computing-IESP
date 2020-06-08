package com.beanstalk.demo.resources;

import com.beanstalk.demo.beans.HelloWorld;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping(path = "/hello-world/{name}")
    public HelloWorld helloWorldPathVariable(@PathVariable String name) {
        return new HelloWorld(String.format("Hello World, %s", name));
    }

}
