package br.edu.unifacisa.si.map.padroes.gof.factoryMethod;

public class FabricaFiat implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Palio();
	}

}
