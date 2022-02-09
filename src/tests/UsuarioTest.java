package MeEmpresta.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MeEmpresta.Usuario;

class UsuarioTest {

	@Test
	public void testCriarUsuario(){
		Usuario usuario = new Usuario("1234567", "pedro@gmail.com", "123456", "Pedro", false);
		assertTrue("Cpf do usuario deveria ser: 1234567", usuario.getCpf() == "1234567" );
		assertTrue("O nome do usuario deveria ser: Teste", usuario.getNome() == "Pedro" );
		assertTrue("O email do usuario deveria ser: pedro@gmail.com", usuario.getEmail() == "pedro@gmail.com" );
		assertTrue("A senha do usuario deveria ser: 123456", usuario.getSenha() == "123456" );
		assertTrue("O usuario não deveria estar bloqueado", usuario.isBloqueado() == false );
	}
	
	@Test
	public void testBloquearUsuario(){
		Usuario usuario = new Usuario("1234567", "pedro@gmail.com", "123456", "Pedro", false);
		usuario.bloquearUsuario();
		assertTrue("O usuario deveria estar bloqueado", usuario.isBloqueado() == true );
	}
	

	@Test
	public void testDesbloquearUsuario(){
		Usuario usuario = new Usuario("1234567", "pedro@gmail.com", "123456", "Pedro", false);
		usuario.bloquearUsuario();
		usuario.desbloquearUsuario();
		assertTrue("O usuario deveria estar bloqueado", usuario.isBloqueado() == false );
	}
	
}
