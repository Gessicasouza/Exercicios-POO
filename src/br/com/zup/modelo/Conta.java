package br.com.zup.modelo;

public class Conta {

	private String nomeCliente;
	private String numeroConta;
	private String banco;
	private String agencia;
	private static double saldo;
	private boolean transferencia;

	public Conta(String nomeCliente, String numeroConta, String banco, String agencia, double saldo,
			boolean transferencia) {
		super();
		this.nomeCliente = nomeCliente;
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.agencia = agencia;
		this.saldo = saldo;
		this.transferencia = transferencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean getTransferencia() {
		return transferencia;
	}

	public void setTransferencia(boolean transferencia) {
		this.transferencia = transferencia;
	}

	// toString
	@Override
	public String toString() {

		String modelo = "";
		modelo += "Nome do(a) Cliente: " + this.getNomeCliente() + "\n";
		modelo += "Número da Conta: " + this.getNumeroConta() + "\n";
		modelo += "Nome do Banco: " + this.getBanco() + "\n";
		modelo += "Agência Bancaria: " + this.getAgencia() + "\n";
		modelo += "Saldo Disponivel para saque: " + this.getSaldo() + "\n";
		modelo += "Transferencia: " + this.getTransferencia();
		return modelo;
	}

	public static void depositar(double valor) {
		saldo += valor;
	}

	public static boolean sacar(double valor) {
		if ((saldo - valor) >= 0) {
			saldo -= valor;
			return true;
		} else {
			return false;

		}
	}

	public void transferencia(double valor1, Conta conta) {
		if (valor1 > this.getSaldo()) {
			this.setSaldo(this.getSaldo() - valor1);
			conta.setSaldo(conta.getSaldo() + valor1);
			System.out.println(" Transferencia efetuada com sucesso. Enviado " 
			+ valor1 + " da conta de " + this.getNomeCliente() + " para conta de " 
		    + conta.getNomeCliente());
		} else {
			System.out.println("Saldo insuficiente para transferencia ");

		}
	}
	
}
