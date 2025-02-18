package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	public void adicionarLancheNoBalcao() {
		System.out.println("Adicionando Lanche Natural Humburgue No Bacao");
	}
	
	public void adicionarSucoNoBalcao() {
		System.out.println("Adicionando Suco No Bacao");
	}
	
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarComboNoBalcao();
	}
	
	public void prepararLanche() {
		System.out.println("Preparando lanche Tipo Humburgue");
	}
	 
	public void prepararVitamina() {
		System.out.println("Preparando Suco");
	}
	
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	
	public void selecionarIngredientesLanche() {
		System.out.println("Selecionado o Pao, Salada, Ovo e Carne");
	}
	
	public void lavarIngredientes() {
		System.out.println("Lavando Ingredientes");
	}
	public void baterVitaminasLiquidificador() {
		System.out.println("Batendo Vitaminas no Liquidificador");
	}
	public void fritarIngredientes() {
		System.out.println("Fritando a Carne e o Ovo para Humburguer");
	}
	

	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIngredientes(Almoxarife almorarife) {
		almorarife.entregarIngredientes();
	}
}
