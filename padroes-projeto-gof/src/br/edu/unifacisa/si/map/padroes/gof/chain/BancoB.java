package br.edu.unifacisa.si.map.padroes.gof.chain;

public class BancoB extends BancoChain {

	public BancoB() {
		super(IDBancos.bancoB);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco B");
	}

}
