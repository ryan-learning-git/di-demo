package guru.springframework.didemo.controllers.dependencyinjectionwithspring;

import guru.springframework.didemo.services.GreetingService;
import guru.springframework.didemo.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//Everything NOT to do.
@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingServiceImpl; //if the name of the property matches the bean name, Spring will fill in the gaps. Don't do this. Use qualifier instead.

    public String sayHello(){
        return greetingServiceImpl.sayGreeting();
    }

}
