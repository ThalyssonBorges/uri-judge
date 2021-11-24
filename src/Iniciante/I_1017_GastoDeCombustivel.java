package Iniciante;

import java.util.Scanner;

public class I_1017_GastoDeCombustivel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tempo, velocidadeMedia; //tempo em Horas, Velocidade em Km/h
		double calculo;
		
		Scanner sc = new Scanner(System.in);
		
		tempo = sc.nextInt();
		velocidadeMedia = sc.nextInt();
		calculo = (velocidadeMedia*tempo) / 12.00;
		
		System.out.printf("%.3f",calculo);
		
	}

}
