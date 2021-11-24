package Iniciante;

import java.util.Scanner;

public class I_1043_Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		/*TRIANGULO - A soma das medidas de dois lados de um triângulo
		é sempre maior que a medida do terceiro lado;*/
		
		if((A+B) > C && (A+C) > B && (B+C) > A) {
			double perimetro =  A + B + C;
			System.out.printf("Perimetro = %.1f\n",perimetro);		
		}else {
			double area = ((A + B) * C)/2;
			System.out.printf("Area = %.1f\n",area);
		}

	}

}
