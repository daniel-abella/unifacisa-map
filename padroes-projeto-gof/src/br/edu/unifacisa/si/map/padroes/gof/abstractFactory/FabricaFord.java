package br.edu.unifacisa.si.map.padroes.gof.abstractFactory;

/**
 * Sistemas de Informa��o - UniFacisa
 * M�todos Avan�ados de Programa��o (MAP)
 * Padr�o Abstract Factory
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class FabricaFord implements FabricaDeCarro {

	@Override
	public CarroSedan criarCarroSedan() {
		return new FiestaSedan();
	}

	@Override
	public CarroPopular criarCarroPopular() {
		return new Fiesta();
	}

}
