package Iniciante;
import java.util.Scanner;

public class I_1047_TempoDeJogoComMinutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int inicio_hora = sc.nextInt();
		int inicio_minuto = sc.nextInt();
		int fim_hora = sc.nextInt();
		int fim_minuto = sc.nextInt();
		
		int calcH, calcM;
	
		
		if(inicio_hora<fim_hora) {
			if(inicio_minuto<fim_minuto || inicio_minuto==fim_minuto){
				calcM = fim_minuto - inicio_minuto;
				calcH = fim_hora - inicio_hora;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
				
			}else {
				calcM = (60 + fim_minuto) - inicio_minuto;
				calcH = fim_hora - inicio_hora;
				calcH--;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
				
			}
		}
		else if(inicio_hora>fim_hora) {
			if(inicio_minuto>fim_minuto) {
				calcM = (60 + fim_minuto) - inicio_minuto;
				calcH = 24 + fim_hora - inicio_hora;
				calcH--;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
			}else {
				calcM = fim_minuto - inicio_minuto;
				calcH = 24 + fim_hora - inicio_hora;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
			}
		}
		else if(inicio_hora==fim_hora){
			if(inicio_minuto==fim_minuto) {
				System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
				
			}else if(inicio_minuto>fim_minuto) {
				calcM = (60 + fim_minuto) - inicio_minuto;
				calcH = 24 + fim_hora - inicio_hora;
				calcH--;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
			}else {
				calcH = fim_hora - inicio_hora;
				calcM = fim_minuto - inicio_minuto;
				System.out.println("O JOGO DUROU "+calcH+" HORA(S) E "+calcM+" MINUTO(S)");
			}
		}
		
	}
}
