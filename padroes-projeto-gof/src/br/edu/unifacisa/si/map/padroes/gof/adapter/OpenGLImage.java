package br.edu.unifacisa.si.map.padroes.gof.adapter;

/**
 * Sistemas de Informação - UniFacisa
 * Métodos Avançados de Programação (MAP)
 * Padrão Adapter
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
