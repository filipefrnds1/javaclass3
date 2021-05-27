package vetor_e_matriz;

import java.util.Locale;
import java.util.Scanner;

public class Aula92Wrapper {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 20;
		
		Object obj = x; //boxing Boxing é o processo de conversão de um objeto tipo valor para um objeto tipo referência compatível
		
		System.out.println(obj);
		
		//int y = obj; // os tipos não são compativeis, necessário casting
		
		int y = (int) obj; //unboxing é o processo de conversão de um objeto tipo referência para um objeto tipo valor compatível
		
		System.out.println(y);
		
		Integer obj2 = x;
		
		System.out.println("Obj2 " + obj2);
		
		int z = obj2 * 2;
		
		System.out.println("z " + z);
		
		
		sc.close();
		
		//Wrapper classes são classes equivalentes aos tipos primitivos, Boxing e Unboxing é natural na linguagem.
		//O wrapper classes naturalmente aceita o tipo null
	}

}
