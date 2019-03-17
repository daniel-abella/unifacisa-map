package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informa��o - UniFacisa
 * M�todos Avan�ados de Programa��o (MAP)
 * Padr�o Adapter
 * Fonte: https://github.com/MarcosX/Padr-es-de-Projeto
 * 
 * @author abella
 */
public class OpenGLImage {

	public void glCarregarImagem(String arquivo) {
		System.out.println("Imagem " + arquivo + " carregada.");
	}

	public void glDesenharImagem(int posicaoX, int posicaoY) {
		System.out.println("OpenGL Image desenhada");
	}
}
