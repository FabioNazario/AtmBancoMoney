package br.edu.infnet.atmbancomoney.visao;

import java.util.List;

import br.edu.infnet.atmbancomoney.control.ContaCtrl;
import br.edu.infnet.atmbancomoney.model.Transacao;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaExtrato implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	public void apresentar() {
                TelaUtil.limparTela();
		System.out.println( TelaUtil.montarTituloTela("EXTRATO") );
		
		List<Transacao> transacoes = contaCtrl.getExtrato();

		for (Transacao transacao : transacoes) {
			System.out.println(transacao); 
		}
		
		
	}

}
