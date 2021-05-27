package vetor_e_matriz;

import java.util.Locale;
import java.util.Scanner;

public class Aula92Wrapper {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 20;
		
		Object obj = x; //boxing Boxing � o processo de convers�o de um objeto tipo valor para um objeto tipo refer�ncia compat�vel
		
		System.out.println(obj);
		
		//int y = obj; // os tipos n�o s�o compativeis, necess�rio casting
		
		int y = (int) obj; //unboxing � o processo de convers�o de um objeto tipo refer�ncia para um objeto tipo valor compat�vel
		
		System.out.println(y);
		
		Integer obj2 = x;
		
		System.out.println("Obj2 " + obj2);
		
		int z = obj2 * 2;
		
		System.out.println("z " + z);
		
		
		sc.close();
		
		//Wrapper classes s�o classes equivalentes aos tipos primitivos, Boxing e Unboxing � natural na linguagem.
		//O wrapper classes naturalmente aceita o tipo null
	}

}
