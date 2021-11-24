package Iniciante;

import java.util.Scanner;

public class I_1010_CalculoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int codPeca1, codPeca2;
		int numeroPeca1, numeroPeca2;
		double precoPeca1, precoPeca2;
		double totalPagar;
		
		Scanner sc = new Scanner(System.in);
		
		codPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		precoPeca1 = sc.nextDouble();
		codPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		precoPeca2 = sc.nextDouble();
		
		totalPagar = numeroPeca1 * precoPeca1 + numeroPeca2 * precoPeca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",totalPagar);
		

	}

}
