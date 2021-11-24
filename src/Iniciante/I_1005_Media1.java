package Iniciante;

import java.util.Scanner;

public class I_1005_Media1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A;
		double B;
		double MEDIA;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		MEDIA = (A * 3.5 + B*7.5)/11;
		
		System.out.printf("MEDIA = %.5f\n",MEDIA);

	}

}
