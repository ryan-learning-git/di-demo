package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller //managed by spring context as it's marked as a spring component
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!!");
        return this.greetingService.sayGreeting();
    }

}
