package Program;

import service.frete.Frete;
import service.frete.TipoFrete;

public class Main {

	public static void main(String[] args) {

		int distancia = 100;
		int opcaoFrete = 2;
		TipoFrete tipoFrete = TipoFrete.values()[opcaoFrete - 1];

		Frete frete = tipoFrete.obterFrete();
		double preco = frete.calcularPreco(distancia);

		System.out.printf("Valor total é de R$%.2f", preco);

	}

}
