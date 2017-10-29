package guru.springframework.didemo.controllers.dependencyinjectionwithspring;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    //no autowired needed if you do a constructor-based one
    private GreetingService greetingService;

    //could mark it as @Autowired but you don't have to.. helps specify intention. Don't use autowired if using a qualifier!
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }


}
