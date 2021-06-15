package br.edu.infnet.atmbancomoney.visao;

import br.edu.infnet.atmbancomoney.control.ContaCtrl;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaSaldo implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	public void apresentar() {
                TelaUtil.limparTela();
                
		System.out.println( TelaUtil.montarTituloTela("SALDO") );
		System.out.println(" O saldo da conta é: " + contaCtrl.getSaldo());
                
                TelaUtil.exibirAperteEnterParaContinuar();
	}

}
