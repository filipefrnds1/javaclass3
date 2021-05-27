package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import objetos.Exer4;

public class ExercicioListaeVectoreMatriz1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		List<Exer4> list = new ArrayList<>();
		String name;
		int id;
		String login;
		int senha;
		
		System.out.println("Informe a quantidade de acessos para cadastrar: ");
		int ac = sc.nextInt();
		
		for(int i = 0; i < ac; i++){
			System.out.println("Informe um número do id: ");
			id = sc.nextInt();
					
			while(hassId(list,id)) {
				System.out.println("id existente, informe outro id: ");
				id = sc.nextInt();
				
			}
			System.out.println("Informe o nome: ");
			sc.nextLine();
			name = sc.nextLine();
			
			System.out.println("Informe o login: ");
			login = sc.nextLine();
			//sc.nextLine();
			System.out.println("Informe a senha: ");
			senha = sc.nextInt();
			
			list.add(new Exer4(id,name,login,senha));
			
			
			
		}
		
		for(Exer4 obj: list) {
			System.out.println(obj);
		}
		
		
		
		
		sc.close();
	}
	public static boolean hassId(List<Exer4> list, int id) {
		Exer4 exer = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return exer != null;
	}
	

}
