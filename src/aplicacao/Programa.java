package aplicacao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entidades.Quarto;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd, numero;
		String nome, email;
		
		List<Quarto> lista = new ArrayList<>();
		
		System.out.print("Quantos quartos serão alugados? ");
		qtd = sc.nextInt();
		
		for(int i=1; i<=qtd; i++) {
			System.out.println();
			sc.nextLine();
			System.out.println("Aluguel #"+i+": ");
			System.out.print("Nome: ");
			nome = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Quarto: ");
			numero = sc.nextInt();
			System.out.println();
			Quarto quarto = new Quarto(nome, email, numero);
			lista.add(quarto);
		}
		
		lista.sort(Comparator.comparingInt(Quarto::getNumero));
		
		for(Quarto obj : lista) {
			System.out.println(obj);
		}
	}
}
