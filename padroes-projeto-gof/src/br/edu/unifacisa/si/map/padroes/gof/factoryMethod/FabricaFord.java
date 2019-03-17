package br.edu.unifacisa.si.map.padroes.gof.factoryMethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}

}
