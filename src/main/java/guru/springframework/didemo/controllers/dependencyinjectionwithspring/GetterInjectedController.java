package guru.springframework.didemo.controllers.dependencyinjectionwithspring;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    @Qualifier("getterGreetingService") //can be at method level or at property level
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }

}
