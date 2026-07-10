package SpringCore.CIWithPrimitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	 ApplicationContext context = new ClassPathXmlApplicationContext("SpringCore/CIWithPrimitive/application-context.xml");
	 Teacher teacher = context.getBean("constructorPrimitive", Teacher.class);
	 IO.println(teacher);
	}

}
