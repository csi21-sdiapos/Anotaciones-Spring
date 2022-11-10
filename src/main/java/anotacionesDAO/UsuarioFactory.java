package anotacionesDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFactory {

	@Autowired
	UsuarioImpl usuarioImpl;
	
	public void getInsertar() {
		usuarioImpl.insertar();
	}
}
