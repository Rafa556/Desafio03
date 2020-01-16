package Veiculo03;

public class Carro03 extends veiculo03{

	private int portas;
	private int ano;

	public int getPortas() {
		return portas;
	}

	public void setPortas(int portas) {
		this.portas = portas;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Carro03(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int portas, int ano) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.portas = portas;
		this.ano = ano;
	}


	public void abastecer(double d) {
		this.setLitrosCombustivel((int) d);	
}
	
	public void acelerar() {
		this.acelerar();
		this.setVelocidade(this.getVelocidade()+60);
			
	}
	
	public void status() {
		super.status();
		System.out.println("\nPortas: " + this.getPortas()+ "\nAno: " + this.getAno());
	}
}
