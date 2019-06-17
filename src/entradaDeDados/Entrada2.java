package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Entrada2 {

	public static void main(String[] args) {
		
		//Mudando pontuação para US
		//Formato americano de pontuação ortográfica
		Locale.setDefault(Locale.US);
				
		//Entrada de dados
		Scanner sc = new Scanner(System.in);
		
		//Variaveis globais com entrada de dados
		int n1 = sc.nextInt(); //35
		sc.nextLine(); //flush
		String name = sc.nextLine(); //Coca
		char gender = sc.next().charAt(0);	//Masculino
		//Entrada como String precisa converter o 5 para integer //b5
		String s = sc.next(); 
		char b = s.charAt(0); //Armazena o B da entrada de dados anterior
		int num = Integer.parseInt(s.substring(1)); //Armazena o 5 da entrada de dados anterior
		//4.32
		double dble = sc.nextDouble(); 
		//Maria F 23 1.68
		String desafio = sc.next(); 
		char gender2 = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
				
		//Saida de dados		
		System.out.println(n1);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(b);
		System.out.println(num);
		System.out.println(dble);
		System.out.println(desafio);
		System.out.println(gender2);
		System.out.println(age);
		System.out.println(height);
		sc.close();
	}

}
