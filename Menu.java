package Banco;

import java.util.Scanner;

public class Menu extends Conta {


	public void menu(Scanner sc) {
		System.out.println("Selecione o número correspondente a opção desejada: \n1 - Cadastrar Conta\n2 - "
				+ "Sacar\n3 - Depositar\n4 - Solicitar emprestimo\n5 - Excluir Conta");
		int opcao = sc.nextInt();
		
		switch(opcao) {
		case 1: 
			cadastrarUsuario(sc);
			break;
		case 2:
			System.out.println("Informe o valor que deseja depositar: ");
			double addDeposito = sc.nextDouble();
			depositar(addDeposito);
			break;
	
		case 3:
			System.out.println("Informe o valor que deseja sacar: ");
			double retirarSaldo = sc.nextDouble();
			saque(retirarSaldo);
			break;
			
		case 4:
			System.out.println("Informe o valor do empréstimo que deseja obter: ");
			double emprestimo = sc.nextDouble();
			emprestimo(emprestimo);
			break;
			
		case 5:
			//excluirConta();
		
		case 0: 
			System.out.println("Esperamos te ver em breve, até mais!!");
			System.exit(0);
		
		default:
			System.out.println("Ops, acho que a informação passada não foi clara. Tente novamente, por gentileza.");
		}
	}
	
	public void cadastrarUsuario(Scanner sc) {
		
		System.out.println("Informe o tipo de conta que deseja criar: PF - Pessoa Fisica\nPJ - Pessoa Juridica"
				+ "\nCP - Conta Poupança");
		String tipoConta = sc.nextLine();
		if(tipoConta == "PF") {
			ContaPF conta1 = new ContaPF(tipoConta);
					
			System.out.println("Conta para Pessoa Fisica: ");
		}else if(tipoConta == "PJ") {
			ContaPJ conta2 = new ContaPJ(tipoConta);

			System.out.println("Conta para Pessoa Juridica: ");
		} else {
			ContaPoupanca conta3 = new ContaPoupanca(tipoConta);
			
			System.out.println("Conta Poupança: ");
		}
	}


			
}
