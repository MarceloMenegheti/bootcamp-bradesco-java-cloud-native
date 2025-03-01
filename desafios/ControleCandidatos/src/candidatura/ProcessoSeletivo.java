package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};


		for(String candidato : candidatos) {
			entrandoEmContato(candidato);
		}

	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso!");
			}
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("Conseguimos contato com o candidato "+ candidato+ " na tentativa n° "+ tentativasRealizadas);
		else
			System.out.println("Nao conseguimos contato com o candidato "+ candidato+ " na tentativa n° "+ tentativasRealizadas);
			
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
	
	static void imprimirCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		for(int i = 0; i < candidatos.length; i++) {
			System.out.println("O candidado de n° " + (i+1) + " e o "+ candidatos[i] );
		}
		
		System.out.println("\nOs candidatos selecionados foram: ");
		for(String candidato : candidatos) {
			System.out.print(candidato + "|");
		}
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;

		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
		    String candidato = candidatos[candidatoAtual];
		    double salarioPretendido = valorPretendido();
		    
		    System.out.println("O candidato "+ candidato + " solicitou este valor de salario "+ salarioPretendido);
		    
		    if(salarioBase >= salarioPretendido) {
		    	System.out.println("O candidato " + candidato + " foi selecionado para a vaga! \n");
		    	candidatosSelecionados++;
		    }
		    candidatoAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analizarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o canditado com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}
}
