package Iniciante;

import java.util.Scanner;

public class I_1011_Esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio, volume, pi=3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		raio = sc.nextDouble();
		volume = (4/3.0) * pi * (raio*raio*raio);

		System.out.printf("VOLUME = %.3f\n",volume);
		
	}

}
