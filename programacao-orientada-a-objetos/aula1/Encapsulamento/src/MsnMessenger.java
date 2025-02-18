
public class MsnMessenger {
	
	public void enviarMenssagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMenssagem();
	}
	
	public void receberMenssagem() {
		System.out.println("Recebendo mensagem");
	}
	
	private void validarConectadoInternet() {
		System.out.println("Validando se esta conectado a internet");
	}
	
	private void salvarHistoricoMenssagem() {
		System.out.println("Salvando o historico da mensagem");
	}
	
}
