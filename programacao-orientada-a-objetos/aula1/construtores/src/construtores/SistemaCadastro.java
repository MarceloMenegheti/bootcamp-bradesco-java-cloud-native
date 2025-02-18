package construtores;

public class SistemaCadastro {
	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcelo = new Pessoa("122", "Marcelo");
		
		//definimos o endereço de marcos
		marcelo.setEndereco("RUA DAS MARIAS");
		
		//e como definir o nome e cpf do marcos ?
	
		
		//imprimindo o marcos sem o nome e cpf

		
		System.out.println(marcelo.getNome() + "-" + marcelo.getCpf());
	}
}
