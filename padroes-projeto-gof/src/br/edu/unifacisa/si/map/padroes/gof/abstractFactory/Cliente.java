package br.edu.unifacisa.si.map.padroes.gof.abstractFactory;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Abstract Factory
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class Cliente {

	public static void main(String[] args) {
		
		FabricaDeCarro fabrica = new FabricaFiat();
		CarroSedan sedan = fabrica.criarCarroSedan();
		CarroPopular popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
		System.out.println();

		fabrica = new FabricaFord();
		sedan = fabrica.criarCarroSedan();
		popular = fabrica.criarCarroPopular();
		sedan.exibirInfoSedan();
		System.out.println();
		popular.exibirInfoPopular();
	}
}
