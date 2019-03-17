package br.edu.unifacisa.si.map.padroes.gof.abstractFactory;

/**
 * Sistemas de Informa��o - UniFacisa
 * M�todos Avan�ados de Programa��o (MAP)
 * Padr�o Abstract Factory
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public interface FabricaDeCarro {
	CarroSedan criarCarroSedan();
	CarroPopular criarCarroPopular();
}
