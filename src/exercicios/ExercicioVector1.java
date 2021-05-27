package exercicios;

import java.util.Locale;
import java.util.Scanner;

import objetos.Quarto;
 

public class ExercicioVector1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Quarto[] qrts = new Quarto[10];
		
		int N, room;
		String nome, email;
		
				
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			System.out.println("Informe o nome do estudante " + (i+1));
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Informe seu email: ");
			//sc.nextLine();
			email = sc.nextLine();
			System.out.println("Room: ");
			room = sc.nextInt();
			
			qrts[room-1] = new Quarto(nome, email);
			//sc.nextLine();
							
		}
	

		
		
		System.out.println("Quartos ocupados: ");
		for(int j = 0; j < 10; j++) {
			if(qrts[j] != null) {
			System.out.printf("%d:  %s, %s%n",(j+1), qrts[j].getNome(), qrts[j].getEmail());
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
