package vetor_e_matriz;

import java.util.Locale;
import java.util.Scanner;

public class Aula93LacoForEach {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------");
		
		
		for(String obj : vect) { //para cada objeto obj contido no vetor vect faça !! <-- Leitura !
			System.out.println(obj);
		}
		
		sc.close();

	}

}
