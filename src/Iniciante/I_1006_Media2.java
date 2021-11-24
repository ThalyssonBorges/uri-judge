package Iniciante;

import java.util.Scanner;

public class I_1006_Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a;
		double b;
		double c;
		double media;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		media = (a*2 + b*3 + c*5)/10;
		
		System.out.printf("MEDIA = %.1f\n",media);
		
	}

}
