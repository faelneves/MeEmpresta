package MeEmpresta;

public class JogosUsuario {

	private int id;
	private int idJogo;
	private String cpfUsuario;
	private boolean emprestado;
	private boolean disponivel;
	
	public JogosUsuario(int id, int idJogo, String cpfUsuario, boolean emprestado, boolean disponivel) {
		super();
		this.id = id;
		this.idJogo = idJogo;
		this.cpfUsuario = cpfUsuario;
		this.emprestado = emprestado;
		this.disponivel = disponivel;
	}
	
	public int getId() {
		return id;
	}
	public int getIdJogo() {
		return idJogo;
	}
	public boolean isEmprestado() {
		return emprestado;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public boolean isDisponivel() {
		return disponivel;
	}
	
	
	
}
