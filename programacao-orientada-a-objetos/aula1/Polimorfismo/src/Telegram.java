
public class Telegram extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
	}
	
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
}
