package entities;

public class Trabalhador {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	public void aumentarSalario(double porcentagem) {
		
		(salarioBruto) +=(((salarioBruto)*porcentagem)/100);
	}
	public String toString() {
		return "Trabalhador: " 
				+ nome
				+ ", $ "
				+ String.format("%.2f", salarioLiquido());
	}
}