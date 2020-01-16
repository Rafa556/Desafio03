package Main03;

import Veiculo03.Avião03;
import Veiculo03.Caminhão03;
import Veiculo03.Carro03;

public class Main003 {

	public static void main(String[] args) {

		Carro03 c1 = new Carro03("Chevrolet", "Camaro", "FLZ1234", "Amarelo", 250, true, 100, 50, 100000, 2, 2014);
		Avião03 a1 = new Avião03("Emirates", "Transporte", "OBG1234", "Branco", 500, true, 400, 300, 500000, "Grande","Pessoas");
		Caminhão03 ca1 = new Caminhão03("Mercedes", "Accelo", "WTF1234", "Preto", 100, true, 200, 60, 200000, 5000, 5);

		{
			c1.abastecer(80);
			a1.abastecer("200");
			ca1.abastecer(100.5);

			c1.status();
			System.out.println("-----------------------------------");
			a1.status();
			System.out.println("-----------------------------------");
			ca1.status();
			System.out.println("-----------------------------------");

		}
	}
}
