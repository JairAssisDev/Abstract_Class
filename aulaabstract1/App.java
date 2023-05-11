package aulaabstract1;

import java.util.List;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorAssociado associado1 = new ProfessorAssociado();
		associado1.setNome("Jair");
		associado1.setSalario(2000);
		ProfessorAssociado associado2 = new ProfessorAssociado();
		associado2.setNome("victor");
		associado2.setSalario(2000);
		ProfessorAssociado associado3 = new ProfessorAssociado();
		associado3.setNome("eve");
		associado3.setSalario(2000);
		
		ProfessorHorista horista1 = new ProfessorHorista();
		horista1.setNome("jao");
		horista1.setSalario(1900);
		ProfessorHorista horista2 = new ProfessorHorista();
		horista2.setNome("jao");
		horista2.setSalario(1900);
		ProfessorHorista horista3 = new ProfessorHorista();
		horista3.setNome("jao");
		horista3.setSalario(1900);
		
		associado1.aumentasalario(20);
		horista2.aumentasalario(30);
		
		List<ProfessorHorista> listadeprofessor = new ArrayList<ProfessorHorista>();
		listadeprofessor.add(horista1);
		listadeprofessor.add(horista2);
		listadeprofessor.add(horista3);
		
		
		for (ProfessorHorista prof : listadeprofessor) {
		    System.out.println("nome: " + prof.getNome()+prof.getSalario());
		}
		
		List<ProfessorAssociado> lAssociados = new ArrayList<ProfessorAssociado>();
		lAssociados.add(associado1);
		lAssociados.add(associado2);
		lAssociados.add(associado3);
		
		for (ProfessorAssociado prof : lAssociados) {
			System.out.println("nome: " + prof.getNome()+prof.getSalario());		}
		
	}	
	
}
 