package guru.springframework.didemo.services;


//@Service
//@Primary //note that primary overrides anything reflected without a qualifier
//@Profile("de")
//moved all this to GreetingServiceConfig
public class PrimaryGermanGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "This is a bit German - not going to type the german in!";
    }
}
