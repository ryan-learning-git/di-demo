package guru.springframework.didemo;

import guru.springframework.didemo.controllers.MyController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.ConstructorInjectedController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.GetterInjectedController;
import guru.springframework.didemo.controllers.dependencyinjectionwithspring.PropertyInjectedController;
import guru.springframework.didemo.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.lang.reflect.Constructor;

@SpringBootApplication
//@ComponentScan(basePackages = {"guru"}) //Can use this if we want to include stuff from outside of the package this file is in.
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) ctx.getBean("myController");

		//from earlier lessons on dependency injection
//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);

        System.out.println("User is " + fakeDataSource.getUser() + ", password is " + fakeDataSource.getPass());

	}
}
