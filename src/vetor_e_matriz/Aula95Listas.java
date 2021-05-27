package vetor_e_matriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Aula95Listas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>(); //list só aceita wrapper classes, não aceita tipos primitivos
							//Os simbolos < > são chamados de generics, para parametrizar a definição de um tipo informando outro tipo que você quiser.
							//List é uma interface. precisamos colocar uma classe que implementa essa interface
							//Opcional <String>
		list.add("Maria");
		list.add("Filipe");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		list.add("Almeida");
		list.add("Araujo");
		
		System.out.println(list.size());
		
		list.remove("Anna");
		list.remove(1);
		
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------");
		list.removeIf(x -> x.charAt(0) == 'M'); // retorna em verdadeiro ou falso, pega um valor x do tipo string e me retorna 
												// se esse x.charat(0) é igual a M
												// se for verdadeiro vai remover, se for falso não vai remover !
		for(String x: list) {
			System.out.println(x);
		}

		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));// Quando o index of não encontra o elemento ele retorna -1
		
		System.out.println("--------------------------------");
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // list.stream é uma conversão para stream ( esse tipo é um tipo
																										 // especial do java 8 em diante que aceita operações com 
																										// expressões lambdas, filter vai devolver um stream filtrado 
		for(String x : result) {																	// conforme o predicado, o collect converte novamente para lista
			System.out.println(x);																	// isso foi uma forma que o java 8 arrumou para manter a compatibilidade
		}																							// com o list que é um tipo antigo e permitir que possa fazer operações
		System.out.println("++++++++++++++++++++++++++++++++");									 // de lambda com o tipo list
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
		System.out.println("-------------------");
		String nami = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);// cada elemento da lista é do tipo string, por isso utilizamos uma 
		System.out.println(nami);															// variavel do tipo string, 
		
		
		
		
		
		sc.close();

	}

}
