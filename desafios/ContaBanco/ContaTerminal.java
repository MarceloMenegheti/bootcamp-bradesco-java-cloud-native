import java.util.Scanner;

public class ContaTerminal {

   public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("Por favor, digite o número da Agência: ");
	int numeroAgencia =sc.nextInt();
    	sc.nextLine();
    
	System.out.print("Por favor, digite a Agência: ");
	String nomeAgencia =sc.nextLine();
	
    	System.out.print("Por favor, Digite seu nome: ");
	String nome = sc.nextLine();

	System.out.print("Por favor, digite o saldo :");
	double saldo =sc.nextDouble();

    
    	System.out.print("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ nomeAgencia + ", conta" + numeroAgencia+" e seu saldo "+ saldo +" já está disponível para saque.");

/*
* 	1021
	067-8
	MARIO ANDRADE
	237.48
* */
	sc.close();
}

}
