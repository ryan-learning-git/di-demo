package guru.springframework.didemo.services;

//@Service
//@Profile("es")
//@Primary //note that primary overrides anything reflected without a qualifier
//moved all this to GreetingServiceConfig
public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return "Servicio de Saludo Primario!";
    }
}
