
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		MsnMessenger msn = new MsnMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		
		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
