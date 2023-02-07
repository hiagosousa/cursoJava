package entities;

public class Worker {
	
	public String name;
	public double grossSalary;
	public double imposto;
	
	public double netSalary() {
		return grossSalary - imposto;
	}
	public void aumentarSalario(double percentage) {
		
		(grossSalary) +=(((grossSalary)*percentage)/100);
	}
	public String toString() {
		return "Trabalhador: " 
				+ name
				+ ", $ "
				+ String.format("%.2f", netSalary());
	}
}
