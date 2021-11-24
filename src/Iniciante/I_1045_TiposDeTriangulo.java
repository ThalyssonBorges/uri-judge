package Iniciante;

import java.util.Scanner;

public class I_1045_TiposDeTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		double[] vetor = new double[3];
		boolean controle;
		int aux;
		
		double A = sc.nextDouble();
		vetor[0] = A;
		double B = sc.nextDouble();
		vetor[1] = B;
		double C = sc.nextDouble();
		vetor[2] = C;
		
		for(int i=0 ; i<vetor.length; i++) {
			controle = true;
			for(int j=0; j<(vetor.length-1); j++) {
				if(vetor[j]<vetor[j+1]) {
					aux = (int) vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
			
		if(vetor[0] >= (vetor[1]+vetor[2]) ) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if((vetor[0]*vetor[0]) == (vetor[1]*vetor[1])+(vetor[2]*vetor[2])) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if((vetor[0]*vetor[0]) > (vetor[1]*vetor[1])+(vetor[2]*vetor[2])) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if((vetor[0]*vetor[0]) < (vetor[1]*vetor[1])+(vetor[2]*vetor[2])) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(vetor[0]==vetor[1] && vetor[0]==vetor[2]) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if(vetor[0]==vetor[1] || vetor[0]==vetor[2] || vetor[1]==vetor[2]) {
				if(vetor[0]!=vetor[1] || vetor[0]!=vetor[2] || vetor[1]!=vetor[2]) {
					System.out.println("TRIANGULO ISOSCELES");
				}
			}
		}
	}
}
