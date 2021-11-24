package Iniciante;

import java.util.ArrayList;
import java.util.Scanner;


public class I_1038_Lanche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		String item;
		double preco;
		
		switch (cod) {
		case 1:
			cod = 1;
			item = "Cachorro Quente";
			preco = 4.00;
			System.out.printf("Total: R$ %.2f\n",qtd*preco);
			break;
		case 2:
			cod = 2;
			item = "X-Salada";
			preco = 4.50;
			System.out.printf("Total: R$ %.2f\n",qtd*preco);
			break;
		case 3:
			cod = 3;
			item = "X-Bacon";
			preco = 5.00;
			System.out.printf("Total: R$ %.2f\n",qtd*preco);
			break;
		case 4:
			cod = 4;
			item = "Torrada Simples";
			preco = 2.00;
			System.out.printf("Total: R$ %.2f\n",qtd*preco);
			break;
		case 5:
			cod = 5;
			item = "Refrigerante";
			preco = 1.50;
			System.out.printf("Total: R$ %.2f\n",qtd*preco);
			break;
		default:
			break;
		}
		
	


		
	}

}
