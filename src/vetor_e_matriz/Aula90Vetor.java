package vetor_e_matriz;

import java.util.Locale;
import java.util.Scanner;

import objetos.Product;

public class Aula90Vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] prod = new Product[n];
		
		for(int i = 0; i < prod.length; i++) { //prod.lenght <- significa o tamanho do vetor, ou seja, podemos usar o n por vect.lenght 
			sc.nextLine();
			String name = sc.nextLine();
			Double preco = sc.nextDouble();
			prod[i] = new Product(name, preco);
			
		}
		
		double sum = 0.0;
		for(int j = 0; j < prod.length; j++) {
			sum += prod[j].getPreco();
		}
		double avg = sum / n;
		
		System.out.printf("AVARAGE PRICE: %.2f", avg);
		
		sc.close();

	}

}
