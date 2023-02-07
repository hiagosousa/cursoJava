package entities;

public class Conta {

	private int numConta;
	private String nomeTitular;
	private double valorConta;

	public Conta(int numConta, String nomeTitular, double depositoInicial) {

		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		fazerDeposito(depositoInicial);
	}

	public Conta(int numConta, String nomeTitular) {

		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getvalorConta() {
		return valorConta;
	}

	public double fazerDeposito(double valor) {
		this.valorConta += valor;
		return this.valorConta;
	}

	public double fazerSaque(double valor) {
		this.valorConta -= valor + 5.0;
		return this.valorConta;
	}

	public String toString() {
		return "Conta " + numConta + ", Titular: " + nomeTitular + ", Balanço: $" + String.format("%.2f", valorConta);
	}

}
