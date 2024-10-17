package guru.springframework.springdi;

import guru.springframework.springdi.services.LifeCycleDemoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDiApplication {

	@Autowired
	LifeCycleDemoBean lifeCycleDemoBean;

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		//MyController controller = ctx.getBean(MyController.class);	// stored beans can be accessed through the context

		//System.out.println("In Main Method");

		//System.out.println(controller.sayHello());
	}

}
