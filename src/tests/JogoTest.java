package MeEmpresta.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MeEmpresta.Jogo;

class JogoTest {

	@Test
	public void testCriarJogo(){
		Jogo jogo = new Jogo(1, "Teste", "Jogo Teste");
		assertTrue("O id do jogo deveria ser: 1", jogo.getId() == 1 );
		assertTrue("O nome do jogo deveria ser: Teste", jogo.getNome() == "Teste" );
		assertTrue("A descrição do jogo deveria ser: Jogo Teste", jogo.getDescricao() == "Jogo Teste" );
	}


}
