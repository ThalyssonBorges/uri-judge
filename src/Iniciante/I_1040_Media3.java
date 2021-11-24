package Iniciante;

import java.util.Scanner;

public class I_1040_Media3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		double N1 = sc.nextDouble();
		double N2 = sc.nextDouble();
		double N3 = sc.nextDouble();
		double N4 = sc.nextDouble();
		
		double media = (float) (N1*2.0 + N2*3.0 + N3*4.0 +N4*1.0)/10;
		
		if(media >= 7) {
			System.out.printf("Media: %.1f\n",media);
			System.out.println("Aluno aprovado.");
		}else if(media <5) {
			System.out.printf("Media: %.1f\n",media);
			System.out.println("Aluno reprovado.");
		}else {
			double NE = sc.nextDouble();
			System.out.printf("Media: %.1f\n",media);
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+NE);
			media = (float) (media + NE) /2;
				if(media>=5) {
					System.out.println("Aluno aprovado.");
					System.out.printf("Media final: %.1f\n",media);
				}else {
					System.out.println("Aluno reprovado.");
					System.out.printf("Media final: %.1f\n",media);
				}
		}
	
	}

}
