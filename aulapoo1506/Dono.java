package aulapoo1506;

import java.util.ArrayList;
import java.util.List;

public class Dono {
	private List<Veicolo>veicolos= new ArrayList<Veicolo>();
	private List<Motorista>motoristas = new ArrayList<Motorista>();
	private String nome;
	
	public List<Veicolo> getVeicolos() {
		return veicolos;
	}
	public void setVeicolos(List<Veicolo> veicolos) {
		this.veicolos = veicolos;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Motorista> getMotoristas() {
		return motoristas;
	}
	public void setMotoristas(List<Motorista> motoristas) {
		this.motoristas = motoristas;
	}
	public void addINlist(Motorista motorista) {
		motoristas.add(motorista);
		
	}
	
}
