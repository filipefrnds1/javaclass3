//Fazer um programa para ler dois números inteiros M e N, e depois ler uma matriz de M linhas por N colunas contendo números inteiros,
//podendo haver repetições. Em seguida, ler um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores à esquerda, acima, à direita e 
//abaixo de X, quando houver, conforme exemplo.

package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioMatriz1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int m = sc.nextInt();	
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.print("Escolha um número da Matriz: ");
		int num = sc.nextInt();
		
		System.out.println();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(num == mat[i][j]) {
					
					System.out.println("Position " + i + "," + j);
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat.length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if(i < mat[i].length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		sc.close();
	}

}
