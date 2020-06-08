package service;

import service.frete.Frete;

public class Sedex implements Frete{

	public double calcularPreco(int distancia) {
		return distancia * 1 + 15;
	}
	
	
}
