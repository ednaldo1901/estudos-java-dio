package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo:");
		String [] candidatos = {"felipe","maria","pedro","roberto","macio","junior"};
		
		for(String candidato: candidatos) {
			entrarEmContato(candidato);
		}
		
	}
	
	static void entrarEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean ateudeu = false;
		do {
			ateudeu = atender();
			continuarTentando = !ateudeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else {
				System.out.println("contato realizado com sucesso!");
			}
			
		}while(continuarTentando && tentativasRealizadas <= 3);
		
		if(ateudeu)
			System.out.println("conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa");
		else {
			System.out.println("não conseguimos contato com o candidato " + candidato + " numero maximo de tentativas realizadas");
		}
	}
	
	
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	

	static void imprimirCandidatos() {
		String [] candidatos = {"felipe","maria","pedro","roberto","macio","junior"};
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"felipe","maria","pedro","roberto","macio","junior","ederson","pirata","paulo","cunha"};
	int canditatosSelecionados = 0;
	int candidatoAtual = 0;
	double salarioBase = 2000.0;
	while(canditatosSelecionados < 5 && candidatoAtual < candidatos.length) {
		String candidato = candidatos[candidatoAtual];
		double salarioPretendito = valorPretendido();
		
		System.out.println("O candidato " + candidato + " Solicitou este valor " + salarioPretendito);
		if(salarioBase > salarioPretendito) {
			System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
			canditatosSelecionados++;
		}
		candidatoAtual++;
		}
	
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO E FAZER CONTRA PROPOSTA.");
			
		}else {
			System.out.println("AGUARDADANDO RESULTADO DOS DEMAIS CANDIDATOS.");
		}
	}
}
