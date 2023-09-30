package avan.examle.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		//TestBean testBean = context.getBean("testBean", TestBean.class);

		HelloBean helloBean = context.getBean("helloBean", HelloBean.class);
		
		System.out.println(helloBean.getName());

		context.close();
	}

}
