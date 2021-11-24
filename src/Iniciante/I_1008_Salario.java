package Iniciante;

import java.util.Scanner;

public class I_1008_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroDoFunc;
		int horas;
		double valorHora;
		
		Scanner sc = new Scanner(System.in);
		
		numeroDoFunc = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		double salario = horas*valorHora;
		
		System.out.println("NUMBER = "+numeroDoFunc);
		System.out.printf("SALARY = U$ %.2f\n",salario);
		

	}

}
