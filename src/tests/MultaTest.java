package MeEmpresta.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MeEmpresta.Multa;

class MultaTest {

	@Test
	public void testCriarMulta(){
		Multa multa = new Multa(1, 10, "123456");
		assertTrue("O id do jogo deveria ser: 1", multa.getId() == 1 );
		assertTrue("O valor da multa deveria ser: 10", multa.getValor() == 190 );
		assertTrue("O cpf do usuario deveria ser: 123456", multa.getCpfUsuario() == "123456" );
	}
	
	@Test
	public void testIsPago(){
		Multa multa = new Multa(1, 10, "123456");
		assertTrue("A multa não deveria estar paga", multa.isPago() == false );
	}
	

	@Test
	public void testPagarMulta(){
		Multa multa = new Multa(1, 10, "123456");
		multa.pagarMulta();
		assertTrue("A multa deveria estar paga", multa.isPago() == true );
	}
}
