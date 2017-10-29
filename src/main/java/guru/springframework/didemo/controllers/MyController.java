package guru.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller //managed by spring context as it's marked as a spring component
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");
        return "foo";
    }

}
