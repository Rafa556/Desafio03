
package Veiculo03;

public class Caminhão03 extends veiculo03{

	private int carga;
	private int eixo;

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getEixo() {
		return eixo;
	}

	public void setEixo(int eixo) {
		this.eixo = eixo;
	}

	public Caminhão03() {
		super();
	}

	public Caminhão03(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, int carga, int eixo) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.carga = carga;
		this.eixo = eixo;
	}

	public void abastecer(double d) {
		this.setLitrosCombustivel((int) d);
	}

	public void acelerar() {
		super.acelerar();
		this.setVelocidade(this.getVelocidade() + 50);
	}

	public void status() {
		super.status();
		System.out.println("\nCarga: " + this.getCarga() + "\nEixos: " + this.getEixo());
	}

}

