package Iniciante;

import java.util.Scanner;

public class I_1012_Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A, B , C;

		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double areaTriangulo = (A*C)/2;
		double areaCirculo = 3.14159 * C*C;
		double areaTrapezio = (A + B)/2 *C;
		double areaQuadrado = B*B;
		double areadoRetangulo = A*B;
		
		System.out.printf("TRIANGULO: %.3f\n",areaTriangulo);
		System.out.printf("CIRCULO: %.3f\n",areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n",areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n",areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n",areadoRetangulo);
		
	}

}
