package guru.springframework.didemo.services;

//@Service
//@Primary //note that primary overrides anything reflected without a qualifier
//@Profile({"en", "default"})
//moved all this to GreetingServiceConfig
public class PrimaryEnglishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryEnglishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello from primary greeting service";
    }
}
