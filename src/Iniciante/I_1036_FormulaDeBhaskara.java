package Iniciante;

import java.util.Scanner;

public class I_1036_FormulaDeBhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double delta = Math.sqrt(B*B - 4*A*C);
		
		if(delta >= 0 && A!=0) {
			double R1 = (-B + delta) / (2*A);
			double R2 = (-B - delta) / (2*A);
			
			System.out.printf("R1 = %.5f\n",R1);
			System.out.printf("R2 = %.5f\n",R2);
					
		}else{
		
			System.out.println("Impossivel calcular");
			
		}

	}

}
