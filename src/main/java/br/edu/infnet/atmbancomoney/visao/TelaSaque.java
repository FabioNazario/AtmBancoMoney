package br.edu.infnet.atmbancomoney.visao;

import java.util.Scanner;

import br.edu.infnet.atmbancomoney.control.ContaCtrl;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaSaque implements Tela {

	private ContaCtrl contaCtrl = new ContaCtrl();

	@SuppressWarnings("resource")
	@Override
	public void apresentar() {
                TelaUtil.limparTela();
                Scanner scanner = new Scanner(System.in);
                Double valorSaque = null;
                
		System.out.println( TelaUtil.montarTituloTela("SAQUE") );
		System.out.println("Informe o valor: ");
		valorSaque = scanner.nextDouble();
		System.out.println( contaCtrl.sacar(valorSaque) );
                TelaUtil.exibirAperteEnterParaContinuar();
                
	}

}
