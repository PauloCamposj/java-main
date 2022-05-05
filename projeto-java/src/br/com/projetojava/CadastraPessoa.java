package br.com.projetojava;

import java.util.Scanner;

public class CadastraPessoa {
	
	private String nome;
	private String cpf;
	
	public CadastraPessoa () {
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Digite seu nome : ");
			
			this.nome =  input.nextLine();
			
			System.out.println("Agora, digite seu cpf: ");
			
			this.cpf =  input.nextLine();
			
			System.out.println("Seu nome é " + nome + " e seu cpf é " + cpf + ".");
			
			System.out.println("Agora digite 1 para sim para realizar seu cadastro ou 2 para não.");
			
			verificacao();	
		}catch(java.util.NoSuchElementException e) {}
	}
	
	public static void verificacao () {
		try (Scanner input = new Scanner(System.in)) {
			int confirmar = input.nextInt();
			int sim = 1;
		
			if (confirmar == sim) {
			System.out.println("Ok, seu cadastro foi concluido com sucesso!");
			}else {
			System.out.println("Você cancelou o cadastro!");
			}
		}return;
	}
}
