package aulaabstract1;

public abstract class Professor {

	private double salario ;
	private String nome;
	public abstract void calcularPagamento(double salario);
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor(double salario) {
		super();
		this.salario = salario;
	}

	public Professor(String nome) {
		super();
		this.nome = nome;
	}
	
}
