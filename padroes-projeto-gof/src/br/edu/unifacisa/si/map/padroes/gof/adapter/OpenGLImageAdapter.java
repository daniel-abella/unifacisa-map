package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Adapter
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class OpenGLImageAdapter extends OpenGLImage implements ImagemTarget {

	@Override
	public void carregarImagem(String nomeDoArquivo) {
		glCarregarImagem(nomeDoArquivo);
	}

	@Override
	public void desenharImagem(int posX, int posY, int largura, int altura) {
		glDesenharImagem(posX, posY);
	}

}
