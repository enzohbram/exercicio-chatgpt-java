package entities;

public class ContaBancaria {

	private int numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(int numeroConta, String nomeTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Operação não é possível devido a saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public void consultarSaldo() {
		System.out.println("R$ " + saldo);
	}
	
}
