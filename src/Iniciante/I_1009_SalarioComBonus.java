package Iniciante;

import java.util.Scanner;

public class I_1009_SalarioComBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome;
		double salario;
		double vendas;
		double liquido;
		
		Scanner sc = new Scanner(System.in);
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		
		liquido = salario + vendas*0.15;
		
		System.out.printf("TOTAL = R$ %.2f\n",liquido);

	}

}
