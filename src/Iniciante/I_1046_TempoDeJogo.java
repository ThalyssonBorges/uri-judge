package Iniciante;

import java.util.Scanner;

public class I_1046_TempoDeJogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			int time = (24-a)+b;
			System.out.println("O JOGO DUROU "+time+" HORA(S)");
		}else if(b>a){
			int time = b - a;
			System.out.println("O JOGO DUROU "+time+" HORA(S)");
		}else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

	}

}
