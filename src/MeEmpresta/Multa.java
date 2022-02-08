package MeEmpresta;

public class Multa {
	private int id;
	private float valor;
	private String cpfUsuario;
	private boolean pago;
	
	
	
	public Multa(int id, float valor, String cpfUsuario) {
		super();
		this.id = id;
		this.valor = valor;
		this.cpfUsuario = cpfUsuario;
		this.pago = false;
	}
	
	public int getId() {
		return id;
	}
	public float getValor() {
		return valor;
	}
	public String getCpfUsuario() {
		return cpfUsuario;
	}
	public boolean isPago() {
		return pago;
	}
	
	public void pagarMulta() {
		this.pago = true;
	}
	
}
