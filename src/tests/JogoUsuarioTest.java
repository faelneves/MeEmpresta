package MeEmpresta.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MeEmpresta.JogoUsuario;

class JogoUsuarioTest {

	@Test
	public void testCriarJogosUsuario(){
		JogoUsuario jogoUsuario = new JogoUsuario(1, 2, "123456", false, false);
		assertTrue("O id do jogo do usuario deveria ser: 1", jogoUsuario.getId() == 1 );
		assertTrue("O id do jogo deveria ser: 2", jogoUsuario.getIdJogo() == 2 );
		assertTrue("O cpf do usuario do jogo deveria ser: 123456", jogoUsuario.getCpfUsuario() == "123456" );
		assertTrue("O jogo não deveria estar emprestado", jogoUsuario.isEmprestado() == false);
		assertTrue("O jogo não deveria estar disponivel para emprestimo", jogoUsuario.isDisponivel() == false);
	}
	
	@Test
	public void testDisponibilizarEmprestimo(){
		JogoUsuario jogoUsuario = new JogoUsuario(1, 2, "123456", false, false);
		jogoUsuario.disponibilizarEmprestimo();
		assertTrue("O jogo deveria estar disponivel para emprestimo", jogoUsuario.isDisponivel() == true);
	}
	
	@Test
	public void testIndisponibilizarEmprestimo(){
		JogoUsuario jogoUsuario = new JogoUsuario(1, 2, "123456", false, false);
		jogoUsuario.disponibilizarEmprestimo();
		jogoUsuario.indisponibilizarEmprestimo();
		assertTrue("O jogo não deveria estar disponivel para emprestimo", jogoUsuario.isDisponivel() == false);
	}
	
}
