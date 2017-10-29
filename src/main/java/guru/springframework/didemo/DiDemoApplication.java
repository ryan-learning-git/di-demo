package guru.springframework.didemo;

import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.ConstructorInjectedController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.GetterInjectedController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.hello());

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

	}
}
