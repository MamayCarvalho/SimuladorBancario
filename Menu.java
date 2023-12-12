package Banco;

import java.util.Scanner;

public class Menu extends Conta {
	
	public Menu(String titular, String tipoConta) {
		super(titular, tipoConta);
	}

	public void menu(Scanner sc) {
		System.out.println("Selecione o número correspondente a ação desejada: \n1 - Cadastrar Conta\n2 - "
				+ "Sacar\n3 - Depositar\n4 - Solicitar emprestimo\n5 - Excluir Conta\n6 - Sair");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			System.out.println("Informe o tipo de conta que deseja criar: PF - Pessoa Fisica\nPJ - Pessoa Juridica"
					+ "\nCP - Conta Poupança");
			String tipoConta = sc.nextLine();
			if(tipoConta == "PF") {
				System.out.println("Conta para Pessoa Fisica: ");
			}else if(tipoConta == "PJ") {
				System.out.println("Conta para Pessoa Juridica: ");
			} else {
				System.out.println("Conta Poupança: ");
			}
		case 2:
			System.out.println("Informe o valor que deseja depositar: ");
			double dinheiro = sc.nextDouble();
			
			depositar(dinheiro);
	
		case 3:
			saque(dinheiro);
			
		case 4:
			emprestimo(dinheiro);
			
		case 5:
			//excluirConta();
		
		case 0: 
			System.out.println("Esperamos te ver em breve, até mais!!");
			System.exit(0);
		
		default:
			System.out.println("Ops, acho que a informação passada não foi clara. Tente novamente, por gentileza.");
		}
	}
			
}
