package Iniciante;

import java.util.Scanner;

public class I_1042_SortSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a<b && a<c) {
			System.out.println(a);
			if(b<c) {
				System.out.println(b);
				System.out.println(c);
			}else{
				System.out.println(c);
				System.out.println(b);
			}
		}else if(b<a && b<c) {
			System.out.println(b);
			if(a<c) {
				System.out.println(a);
				System.out.println(c);
			}else {
				System.out.println(c);
				System.out.println(a);
			}
		}else if(c<a && c<b) {
			System.out.println(c);
			if(a<b) {
				System.out.println(a);
				System.out.println(b);
			}else {
				System.out.println(b);
				System.out.println(a);
			}
		}
		System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
