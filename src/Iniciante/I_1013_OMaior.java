package Iniciante;

import java.util.Scanner;

public class I_1013_OMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b , c, maiorAB, maior;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorAB = (a+b+Math.abs(a-b))/2;
		maior = (maiorAB + c + Math.abs(maiorAB - c))/2;
		
		System.out.println(maior+" eh o maior");
	}

}
