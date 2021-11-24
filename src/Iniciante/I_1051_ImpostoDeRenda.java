package Iniciante;

import java.util.Scanner;

public class I_1051_ImpostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario>0.00 && salario<=2000.00) {
			System.out.println("Isento");
			
		}else if(salario>2000.00 && salario<=3000.00) {
			double imposto = (salario - 2000.00)* 0.08;
			System.out.printf("R$ %.2f\n",imposto);
			
		}else if(salario>3000.00 && salario<=4500.00) {
			double imposto1 = (salario - 3000.00)* 0.18;
			double imposto2 = (3000.00-2000.00)* 0.08;
			double impostoFinal = imposto1+imposto2;
			System.out.printf("R$ %.2f\n",impostoFinal);
			
		}else if(salario>4500.00) {
			double imposto1 = (salario-4500.00)*0.28;
			double imposto2 = (4500.00 - 3000.00)* 0.18;
			double imposto3 = (3000.00 - 2000.00)* 0.08;
			double impostoFinal = imposto1+imposto2+imposto3;
			System.out.printf("R$ %.2f\n",impostoFinal);

		}
	}

}
