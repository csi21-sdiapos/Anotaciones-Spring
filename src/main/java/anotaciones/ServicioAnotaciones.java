package anotaciones;

import org.springframework.stereotype.Service;

@Service
public class ServicioAnotaciones {

	public String getMensaje() {
		return "Enviando mensaje desde la clase ServicioAnotaciones";
	}
}
