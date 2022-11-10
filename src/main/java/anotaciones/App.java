package anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		ServicioAnotaciones servicioAnotaciones = (ServicioAnotaciones) applicationContext.getBean("servicioAnotaciones");
		
		System.out.println(servicioAnotaciones.getMensaje());
	}

}
