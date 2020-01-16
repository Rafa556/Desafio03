package Veiculo03;

public class veiculo03 {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public veiculo03() {

	}

	public veiculo03(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public void acelerar() {
		if (this.isLigado() == true) {
			this.setVelocidade(this.getVelocidade() + 20);
			this.setLitrosCombustivel(litrosCombustivel - 1);
		} else {
			System.out.println("não é possivel acelerar com o veiculo desligado.");
		}
	}

	int dif;

	public void abastecer(int li) {
		if (this.getLitrosCombustivel() < 100) {
			if (this.getLitrosCombustivel() + li > 100) {
				this.getLitrosCombustivel();
				dif = li - 50;
				System.out.println("O tanque já atingiu o limite, não há como encher mais.");
				System.out.println("Passou " + dif + "litros de gasolina do limite do tanque");
			} else {
				this.setLitrosCombustivel(this.getLitrosCombustivel() + li);
			}
		}
	}

	public void frear() {
		if (isLigado == true) {
			if (this.getVelocidade() < 0) {
				System.out.println("O veiculo está parado.");
			} else {
				this.velocidade = this.velocidade - 10;
			}
		} else {
			System.out.println("Não é possivel freiar, pois, seu carro está desligado.");
		}

	}

	public void pintar() {
		this.cor = cor;
		
	}

	public void ligar() {
		if (this.isLigado = true) {
			this.isLigado = true;
			System.out.println("O veiculo está ligado.");

		} else {
			System.out.println("O veiculo está desligado.");
		}
	}
	
	public void desligar() {
		if (this.isLigado = true) {
			this.isLigado = false;
			System.out.println("O veiculo está desligando.");
			
		}else {
			System.out.println("O veiculo ainda está ligado.");
		}
	}
	public void status () {
		System.out.println ("\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo()+ 
				"\nPlaca: " + this.getPlaca() + "\nCor: " + this.getCor() + "\nKm: " + this.getKm()+
				"\nLigado: " + this.isLigado() + "\nLitros de gasolina: " + this.getLitrosCombustivel() + 
				"\nVelocidade: " + this.getVelocidade() + "\nPreço: " + this.getPreco());
		
	}
}
