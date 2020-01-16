package Veiculo03;

public class Avião03 extends veiculo03 {

	private String tipo;
	private String uso;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUso() {
		return uso;
	}

	public void setUso(String uso) {
		this.uso = uso;
	}

	public Avião03(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco, String tipo, String uso) {
		super(marca, modelo, placa, cor, km, isLigado, litrosCombustivel, velocidade, preco);
		this.tipo = tipo;
		this.uso = uso;
	}
	
	public void abastecer (String quantidade) {
		this.setLitrosCombustivel(Integer.parseInt(quantidade));
	}
    public void acelerar() {
    	super.acelerar();
    	this.setVelocidade(this.getVelocidade()+300);
}
	
    public void status(){
    	super.status();
    	System.out.println("\nTipo: " + this.getTipo()+ "\nUso: " + this.getUso());
    }
	
	
}
