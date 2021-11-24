package Iniciante;

import java.util.Scanner;

public class I_1060_NumerosPositivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double[] n = new double[6];
		int contPositivo=0;
		
		for(int i=0; i<6; i++) {
			n[i] = sc.nextDouble();
			if(n[i]>0) {
				contPositivo++;
			}
		}
		System.out.println(contPositivo+" valores positivos");
		
	}

}
