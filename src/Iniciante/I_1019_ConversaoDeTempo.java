package Iniciante;

import java.util.Scanner;

public class I_1019_ConversaoDeTempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int N, segundos, horas, minutos, m;
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		segundos = N % 60;
		m = N / 60;
		minutos = m % 60;
		horas = m / 60;

		
		String horario = String.format("%01d:%01d:%01d",horas,minutos,segundos);
		System.out.println(horario);
		
		


	}

}
