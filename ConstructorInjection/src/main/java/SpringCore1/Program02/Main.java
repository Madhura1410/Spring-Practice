package SpringCore1.Program02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("SpringCore1/Program02/application-context.xml");
	Employee2 bean = context.getBean("Employee2", Employee2.class);
	bean.displayEmployee();
	

	}

}
