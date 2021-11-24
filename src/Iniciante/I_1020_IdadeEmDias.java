package Iniciante;

import java.util.Scanner;

public class I_1020_IdadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d, dias, meses, anos;
		
		Scanner sc = new Scanner(System.in);
		
		d = sc.nextInt();
		
		anos = d/365;
		meses = (d%365)/30;
		dias = (d%365)%30;
		

		System.out.println(anos+" ano(s)");
		System.out.println(meses+" mes(es)");
		System.out.println(dias+" dia(s)"); 

	}

}
