package br.com.zup.teste;

import br.com.zup.modelo.Conta;
import br.com.zup.modelo.ContaPoupanca;

public class TestePessoa {

	public static void main(String[] args) {

		Conta conta = new Conta("Gessica sousa", "00000-00000", "Santander ", "São Paulo", 200, false);

		
		System.out.println(conta);

		Conta.depositar(500);
		Conta.depositar(500);

		System.out.println("---Saque 1----");
		realizarSaque(conta, 500);

		System.out.println("---Saque 2----");
		realizarSaque(conta, 800);
		
		System.out.println("Seu saldo atual é de = " + conta.getSaldo());
           

		
		// Outra conta
		ContaPoupanca conta1 = new ContaPoupanca("Miguel Bastos", "1111-1111", "Bradesco", "São Paulo", 100, false);
		System.out.println("-------------------------------------------");
		System.out.println("\n" + conta1);

		ContaPoupanca.depositar(50);

		System.out.println("---Saque 1----");
		realizarSaque(conta1, 90);

		System.out.println("---Saque 2----");
		realizarSaque(conta1, 250);

		conta.transferencia(200, conta1);

		
	}

	private static void realizarSaque(Conta conta, double valor) {
		if (Conta.sacar(valor)) {
			System.out.println("Saque Efetuado com sucesso na conta de " + conta.getNomeCliente() + ", Saldo Atual =  "
					+ conta.getSaldo());
		} else {
			System.out.println("Saldo Indisponivel para Saque de " + valor + ", na conta de " + conta.getNomeCliente()
					+ " seu saldo atual é = " + conta.getSaldo());
		}

	}
}