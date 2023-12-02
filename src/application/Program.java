package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BANCO DA ALEGRIA");
		System.out.print("Número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
		ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);
		
		System.out.println("Sr. " + nomeTitular + ", qual operação você deseja realizar?");
		System.out.print("Depósito, Saque ou Consulta do Saldo: ");
		sc.nextLine();
		String resp = sc.nextLine();
		
		String continuar;
		do {
			switch(resp) {
			case "Depósito":
				System.out.print("Digite o valor do depósito: ");
				double deposito = sc.nextDouble();
				conta.depositar(deposito);
				break;
			case "Saque":
				System.out.print("Digite o valor do saque: ");
				double saque = sc.nextDouble();
				conta.sacar(saque);
				break;
			case "Consulta do Saldo":
				conta.consultarSaldo();
				break;
			default:
				System.out.println("Opção inválida");
				break;
			}
				System.out.println("Deseja realizar outra operação? Sim/Não");
				continuar = sc.nextLine();
				
				if (continuar.equals("Sim")) {
			        System.out.print("Depósito, Saque ou Consulta do Saldo: ");
			        resp = sc.nextLine();
			    }
		} while (!continuar.equals("Não"));
		
		System.out.println("OPERAÇÃO FINALIZADA");

		sc.close();
	}

}
