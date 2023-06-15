package aulapoo1506;

import java.util.ArrayList;
import java.util.List;

public class AppTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Dono>donos=new ArrayList<Dono>();
		Veicolo automovel1 = new Automovel(1997, "fiat",3000.0);
		Veicolo caminhao1 = new Caminhao(2022, "Scanea", 5000.0);
		Veicolo caminhao2 = new Caminhao(2022, "volvo", 5000.0);
		
		Motorista motorista1 = new Motorista();
		motorista1.setNome("victor");
		Motorista motorista2 = new Motorista();
		motorista2.setNome("pedro");
		
		Dono dono1 = new Dono();
		dono1.setNome("jair");
		Dono dono2 = new Dono();
		dono2.setNome("jsdsair");
		
		donos.add(dono1);
		donos.add(dono2);
		
		dono1.addINlist(motorista1);
		dono1.addINlist(motorista2);
		
		
		
		dono1.getVeicolos().add(automovel1);
		dono1.getVeicolos().add(caminhao1);
		dono2.getVeicolos().add(caminhao2);
		
		for (Motorista motorista : dono1.getMotoristas()) {
			System.out.println("O nome do dono: "+dono1.getNome() + "nome do mortorista: " + motorista.getNome());
		}
		
		for (Dono dono : donos) {
			System.out.println("nome dos donos: "+dono.getNome());
		
		for (Veicolo veicolo : dono  .getVeicolos()) {
			
			if(veicolo instanceof Caminhao) 
				System.out.println("marca do caminhao: "+veicolo.getMarca());
		}
		}
		
	}

}
