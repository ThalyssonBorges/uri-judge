package Iniciante;

import java.util.Scanner;


public class I_1015_DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, y1, x2, y2;
		double distancia;
		
		Scanner sc = new Scanner(System.in);
		
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		distancia = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.printf("%.4f\n",distancia);
	}

}
