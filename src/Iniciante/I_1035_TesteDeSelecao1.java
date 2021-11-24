package Iniciante;

import java.util.Scanner;

public class I_1035_TesteDeSelecao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A, B , C , D;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		if ((B>C) && (D>A) && (C+D) > (A+B) && (C>0) && (D>0)){
			if(A%2==0) {
				System.out.println("Valores aceitos");
			}
		}else {
		System.out.println("Valores nao aceitos");
		}
	}
}
