package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informa��o - UniFacisa
 * M�todos Avan�ados de Programa��o (MAP)
 * Padr�o Adapter
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
