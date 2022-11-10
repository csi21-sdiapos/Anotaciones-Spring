package anotacionesDAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		UsuarioFactory usuarioFactory = (UsuarioFactory) applicationContext.getBean("usuarioFactory");
		
		usuarioFactory.getInsertar();
	}

}
