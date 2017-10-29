package guru.springframework.didemo.controllers.dependencyinjectionnoframework;

import guru.springframework.didemo.services.GreetingServiceImpl;

//Everything NOT to do.
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }



}
