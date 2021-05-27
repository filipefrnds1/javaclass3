package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import objetos.Employees;

public class ExercicioListas1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Employees employ = new Employees();
		
		List<Employees> list = new ArrayList<>();
		
		
		int id;
		String name;
		double salary;
		int employ;
		//double porcentage = 0;
		
		System.out.print("How many employees will be registered? ");
		employ = sc.nextInt();
		
		for(int i = 0; i < employ; i++) {
			
			System.out.println();
			System.out.println("Employee #" + (i+1) + ":");
			System.out.print("Id: ");
				id = sc.nextInt();
			
			while(hasId(list,id)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
				sc.nextLine();
				name = sc.nextLine();
			System.out.print("Salary: ");
				salary = sc.nextDouble();
			
				list.add(new Employees(id,name,salary));
			
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
			int id1 = sc.nextInt();
		Employees emp = list.stream().filter(x -> x.getId() == id1).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist! ");
		}else {
			System.out.print("Enter the porcentage: ");
			double porcentage = sc.nextDouble();
			emp.salarioUp(porcentage);
			
		}
		System.out.println();
		System.out.println("List of employees: ");
		for(Employees obj : list) {
			System.out.println(obj);
			
		}
		
		
		
		
		
		
		sc.close();
	}
	
	public static boolean hasId(List<Employees> list, int id) {
		Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
		
	}

}
