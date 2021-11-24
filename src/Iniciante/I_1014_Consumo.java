package Iniciante;

import java.util.Scanner;

public class I_1014_Consumo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x; 	  //distancia total em KM
		double y; //total de combustivel gasto em L 
		double consumo;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextDouble();
		
		consumo = x / y;
		
		System.out.printf("%.3f km/l\n",consumo);
		
	}

}
