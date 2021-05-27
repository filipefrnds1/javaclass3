package vetor_e_matriz;

import java.util.Locale;
import java.util.Scanner;

public class Aula89Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media = 0;
		
				
		System.out.println("Informe um valor inteiro: ");
		n = sc.nextInt();
		
		double[] alt = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.println("Informe a altura da pessoa :" + (i+1));
			alt[i] = sc.nextDouble();
			media = media + alt[i];
		}
		media = media / n;
		
		System.out.printf("AVARAGE HEIGHT = %.2f", media);
		
		
		
		
		
		
		sc.close();
	}

}
