package Iniciante;

import java.util.Scanner;

public class I_1007_Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		int b;
		int c;
		int d;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		diferenca = (a*b - c*d);
		
		System.out.println("DIFERENCA = "+diferenca);
	}

}
