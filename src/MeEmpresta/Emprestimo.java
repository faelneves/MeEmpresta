package MeEmpresta;

public class Emprestimo {

	private int id;
	private int idJogo;
	private String cpfUsuario;
	private int status; // 0- 1-aprovado 2-recusado 3-em atraso 4-devolvido
	private String dataDevolucaoLimite;
	private String dataDevolucaoReal;
	
	
	
	public Emprestimo(int id, int idJogo, String cpfUsuario, String dataDevolucaoLimite) {
		super();
		this.id = id;
		this.idJogo = idJogo;
		this.cpfUsuario = cpfUsuario;
		this.dataDevolucaoLimite = dataDevolucaoLimite;
		this.dataDevolucaoReal = null;
		this.status = 1;
		
	}
	public String getDataDevolucaoReal() {
		return dataDevolucaoReal;
	}
	public void setDataDevolucaoReal(String dataDevolucaoReal) {
		this.dataDevolucaoReal = dataDevolucaoReal;
	}
	public int getId() {
		return id;
	}
	public int getIdJogo() {
		return idJogo;
	}
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public int getStatus() {
		return status;
	}
	public void setDataDevolucaoLimite(String dataDevolucaoLimite) {
		this.dataDevolucaoLimite = dataDevolucaoLimite;
	}
	public String getDataDevolucaoLimite() {
		return dataDevolucaoLimite;
	}
	public void aprovarEmprestimo() {
		this.status = 1;
	}
	public void reprovarEmprestimo() {
		this.status = 2;
	}
	public void confirmarDevolucao() {
		this.status = 4;
	}
	
	public boolean verificarAtraso() {
		//To do...
		return false;
	}
	
}
