package pruebas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.crud.tendencias.entity.UsuarioRequest;



public class UsuarioRequestTest {

	// Método de prueba para verificar el constructor de UsuarioRequest.
	@Test
	public void testConstructor() {
		// Crea un objeto UsuarioRequest con valores específicos.
		UsuarioRequest usuarioRequest = new UsuarioRequest("Juan", "password", "juan@example.com", true);

		// Verifica que el objeto creado no sea nulo.
		assertNotNull(usuarioRequest);

		// Verifica que los atributos del objeto tengan los valores esperados.
		assertEquals("Juan", usuarioRequest.getNombre());
		assertEquals("password", usuarioRequest.getClave());
		assertEquals("juan@example.com", usuarioRequest.getMail());
		assertTrue(usuarioRequest.isEstado());
	}
}
