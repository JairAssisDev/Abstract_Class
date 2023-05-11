package aulaabstract1;

import java.util.List;
import java.util.ArrayList;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorAssociado associado = new ProfessorAssociado();
		associado.setNome("Jair");
		associado.setSalario(2000);
		ProfessorHorista horista = new ProfessorHorista();
		horista.setNome("jao");
		horista.setSalario(1900);
		
		associado.aumentasalario(20);
		horista.aumentasalario(30);
		
		List<String> listadeprofessor = new ArrayList<>();
		listadeprofessor.add("Nome: "+associado.getNome()+" Salario: "+associado.getSalario());
		listadeprofessor.add("Nome: "+horista.getNome()+" Salario: "+horista.getSalario());
		
		for (String prof : listadeprofessor) {
		    System.out.println("Aula: " + prof);
		}
		
		
		
		
	}	
	
}
 