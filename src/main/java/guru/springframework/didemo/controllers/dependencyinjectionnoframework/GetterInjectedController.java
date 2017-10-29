package guru.springframework.didemo.controllers.dependencyinjectionnoframework;

import guru.springframework.didemo.services.GreetingService;

public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
