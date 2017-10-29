package guru.springframework.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary //note that primary overrides anything reflected without a qualifier
@Profile("en")
public class PrimaryEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from primary greeting service";
    }
}
