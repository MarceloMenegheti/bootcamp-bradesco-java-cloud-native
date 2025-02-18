package lanchonete.atendimento;

public class Atendente {
	
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo a mesa");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando o Lanche na Cozinha");
	}
	
	public void receberPagamento() {
		System.err.println("Recebendo Pagamento");
	}
	
	void trocarGas() {
		System.out.println("Atendente trocando o Gas");
	}
	
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o Pedido no Balcao");
	}



}
