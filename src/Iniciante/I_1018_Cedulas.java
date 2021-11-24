package Iniciante;

import java.util.Scanner;

public class I_1018_Cedulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n, troco;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if(n>0 && n<1000000) {
			int notas100;
			int notas50;
			int notas20;
			int notas10;
			int notas5;
			int notas2;
			int notas1;
			
			notas100 = n/100;
				troco = n - notas100*100;
			notas50 =  troco/50;
				troco = troco - notas50*50;
			notas20 = troco/20;
				troco = troco - notas20*20;
			notas10 = troco/10;
				troco = troco - notas10*10;
			notas5 = troco/5;
				troco = troco - notas5*5;
			notas2 = troco/2;
				troco = troco - notas2*2;
			notas1 = troco /1;

			
			System.out.println(n);
			System.out.println(notas100+" nota(s) de R$ 100,00");
			System.out.println(notas50+" nota(s) de R$ 50,00");
			System.out.println(notas20+" nota(s) de R$ 20,00");
			System.out.println(notas10+" nota(s) de R$ 10,00");
			System.out.println(notas5+" nota(s) de R$ 5,00");
			System.out.println(notas2+" nota(s) de R$ 2,00");
			System.out.println(notas1+" nota(s) de R$ 1,00");
			
			
		}else {
			System.out.println("ERROR");
		}

	}

}
