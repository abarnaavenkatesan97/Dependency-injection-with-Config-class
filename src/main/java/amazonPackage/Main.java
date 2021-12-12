package amazonPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
		//ApplicationContext context = new ClassPathXmlApplicationContext("amazonspring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfigClass.class);
		Amazon amazon = context.getBean("amazon",Amazon.class);
		amazon.test();
	}

}

