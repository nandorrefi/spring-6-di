package guru.springframework.springdi;

import guru.springframework.springdi.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);	// stored beans can be accessed through the context

		System.out.print("In Main Method");

		System.out.print(controller.sayHello());
	}

}
