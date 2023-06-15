package aulapoo1506;

public abstract class Veicolo {
	private int ano;
	private String marca;
	private Double podenciaCV;
	
	public abstract void ligarANDdesligar();
	
	public abstract void qtdRodas();

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Double getPodenciaCV() {
		return podenciaCV;
	}

	public void setPodenciaCV(Double podenciaCV) {
		this.podenciaCV = podenciaCV;
	}

	public Veicolo(int ano, String marca, Double podenciaCV) {
		super();
		this.ano = ano;
		this.marca = marca;
		this.podenciaCV = podenciaCV;
	}
	
	
}
