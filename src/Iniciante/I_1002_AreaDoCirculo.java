package Iniciante;

import java.util.Scanner;

public class I_1002_AreaDoCirculo {

	public static void main(String[] args) {
        double pi = 3.14159;
        double r = 0.0;
        double area = 0.0;
        
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        area = pi * r * r;
        System.out.printf("A=%.4f\n",area);

	}

}
