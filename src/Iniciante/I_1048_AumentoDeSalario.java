package Iniciante;

import java.util.Scanner;

public class I_1048_AumentoDeSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		if(salario>0 && salario <=400.00) {
			double percentual = salario*0.15;
			double salarioReajustado = salario + percentual;
			System.out.printf("Novo salario: %.2f\n",salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 15 %");	
		}else if(salario>400.00 && salario<=800.00) {
			double percentual = salario*0.12;
			double salarioReajustado = salario + percentual;
			System.out.printf("Novo salario: %.2f\n",salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 12 %");	
		}else if(salario>800.00 && salario<=1200.00) {
			double percentual = salario*0.10;
			double salarioReajustado = salario + percentual;
			System.out.printf("Novo salario: %.2f\n",salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 10 %");		
		}else if(salario>1200.00 && salario<=2000.00) {
			double percentual = salario*0.07;
			double salarioReajustado = salario + percentual;
			System.out.printf("Novo salario: %.2f\n",salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 7 %");	
		}else if(salario>2000.00) {
			double percentual = salario*0.04;
			double salarioReajustado = salario + percentual;
			System.out.printf("Novo salario: %.2f\n",salarioReajustado);
			System.out.printf("Reajuste ganho: %.2f\n",percentual);
			System.out.println("Em percentual: 4 %");			
		}
		
		

	}

}
