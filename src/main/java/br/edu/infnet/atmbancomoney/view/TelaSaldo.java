package br.edu.infnet.atmbancomoney.view;

import br.edu.infnet.atmbancomoney.control.ContaCtrl;
import br.edu.infnet.atmbancomoney.util.StringUtil;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaSaldo implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	public void apresentar() {
                TelaUtil.limparTela();
		System.out.println( TelaUtil.montarTituloTela("SALDO") );
		System.out.println("O saldo da conta é: R$" + StringUtil.doubleToString(contaCtrl.getSaldo()));
                
                TelaUtil.exibirAperteEnterParaContinuar();
	}

}
