package lanchonete.atendimento.cozinha;

public class Almoxarife {

	
		private void controlarEntrada() {
			System.out.println("Controlando a Entrada");
		}
		
		private void controlarSaida() {
			System.out.println("Controlando a Saida");
		}
		
		void entregarIngredientes() {
			System.out.println("Entregando Ingredientes");
			controlarSaida();
		}
		
		void trocarGas() {
			System.out.println("Almoxarife Trocando o Gas");
		}

}
