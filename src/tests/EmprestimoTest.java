package MeEmpresta.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MeEmpresta.Emprestimo;
import MeEmpresta.Multa;

class EmprestimoTest {
	
	public static final int PENDENTE = 0;
	public static final int APROVADO = 1;
	public static final int REPROVADO = 2;
	public static final int ATRASADO = 3;
	public static final int FINALIZADO = 4;
	

	@Test
	public void testCriarEmprestimo(){
		Emprestimo emprestimo = new Emprestimo(1, 2, "123456", "08/02/2022");
		assertTrue("O id do emprestimo deveria ser: 1", emprestimo.getId() == 1 );
		assertTrue("O id do jogo do emprestimo deveria ser: 2", emprestimo.getIdJogo() == 2 );
		assertTrue("O cpf do usuario do emprestimo deveria ser: 123456", emprestimo.getCpfUsuario() == "123456" );
		assertTrue("A data de devolução deveria ser: 08/02/2022", emprestimo.getDataDevolucaoLimite() == "08/02/2022" );
		assertTrue("O status deveria ser pendente", emprestimo.getStatus() == PENDENTE );
	}
	
	@Test
	public void testAprovarEmprestimo(){
		Emprestimo emprestimo = new Emprestimo(1, 2, "123456", "08/02/2022");
		emprestimo.aprovarEmprestimo();
		assertTrue("O status deveria ser aprovado", emprestimo.getStatus() == APROVADO );
	}

	@Test
	public void testReprovarEmprestimo(){
		Emprestimo emprestimo = new Emprestimo(1, 2, "123456", "08/02/2022");
		emprestimo.reprovarEmprestimo();
		assertTrue("O status deveria ser reprovado", emprestimo.getStatus() == REPROVADO );
	}
	
	@Test
	public void testConfirmarDevolucao(){
		Emprestimo emprestimo = new Emprestimo(1, 2, "123456", "08/02/2022");
		emprestimo.confirmarDevolucao();
		assertTrue("O status deveria ser finalizado", emprestimo.getStatus() == FINALIZADO );
	}

	@Test
	public void testVerificarAtraso(){
		Emprestimo emprestimo = new Emprestimo(1, 2, "123456", "02/01/2021");
		assertTrue("O emprestimo deveria estar atrasado", emprestimo.verificarAtraso() == true );
		assertTrue("O status deveria ser atrasado", emprestimo.getStatus() == ATRASADO );
	}
}
