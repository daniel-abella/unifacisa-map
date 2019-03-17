package br.edu.unifacisa.si.map.padroes.gof.factoryMethod;

public class FabricaWolks implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Gol();
	}

}
