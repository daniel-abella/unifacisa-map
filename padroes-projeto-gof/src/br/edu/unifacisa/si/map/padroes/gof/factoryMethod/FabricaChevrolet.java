package br.edu.unifacisa.si.map.padroes.gof.factoryMethod;

public class FabricaChevrolet implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Celta();
	}

}
