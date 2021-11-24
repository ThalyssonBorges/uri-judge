package Iniciante;

import java.util.Scanner;


public class I_1021_NotasMoedas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c100, c50, c20, c10, c5, c2;
		int m1, m50, m25, m10, m05, m01; 
		
		Scanner sc = new Scanner(System.in);
		double valorInformado = sc.nextDouble();
		int valor = 0;
	
			System.out.println("NOTAS:");
			valor = (int) (valorInformado /100);
			System.out.printf("%d nota(s) de R$ 100.00%n",valor);
			valorInformado = valorInformado % 100.0;
			
			valor = (int) (valorInformado /50);
			System.out.printf("%d nota(s) de R$ 50.00%n",valor);
			valorInformado = valorInformado % 50.0;
			
			valor = (int) (valorInformado /20);
			System.out.printf("%d nota(s) de R$ 20.00%n",valor);
			valorInformado = valorInformado % 20.0;
			
			valor = (int) (valorInformado /10);
			System.out.printf("%d nota(s) de R$ 10.00%n",valor);
			valorInformado = valorInformado % 10.0;
			
			valor = (int) (valorInformado /5);
			System.out.printf("%d nota(s) de R$ 5.00%n",valor);
			valorInformado = valorInformado % 5.0;
			
			valor = (int) (valorInformado /2);
			System.out.printf("%d nota(s) de R$ 2.00%n",valor);
			valorInformado = valorInformado % 2.0;
			
			valorInformado = valorInformado * 100.0;
			
			System.out.println("MOEDAS:");
			
			valor = (int) (valorInformado /100);
			System.out.printf("%d nota(s) de R$ 1.00%n",valor);
			valorInformado = valorInformado % 100.0;
			
			valor = (int) (valorInformado /50);
			System.out.printf("%d moeda(s) de R$ 0.50%n",valor);
			valorInformado = valorInformado % 50.0;
			
			valor = (int) (valorInformado /25);
			System.out.printf("%d moeda(s) de R$ 0.25%n",valor);
			valorInformado = valorInformado % 25.0;
			
			valor = (int) (valorInformado /10);
			System.out.printf("%d moeda(s) de R$ 0.10%n",valor);
			valorInformado = valorInformado % 10.0;
			
			valor = (int) (valorInformado /5);
			System.out.printf("%d moeda(s) de R$ 0.05%n",valor);
			valorInformado = valorInformado % 5.0;
			
			valor = (int) (valorInformado /1);
			System.out.printf("%d moeda(s) de R$ 0.01%n",valor);
			valorInformado = valorInformado % 1.0;
			
		
		
	}

}
