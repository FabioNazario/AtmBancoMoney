package br.edu.infnet.atmbancomoney.visao;

import java.util.Scanner;

import br.edu.infnet.atmbancomoney.control.ContaCtrl;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaDeposito implements Tela{
	
	private ContaCtrl contaCtrl = new ContaCtrl();
	
	private double valor;
	
	@SuppressWarnings("resource")
	public void apresentar() {
                TelaUtil.limparTela();
		System.out.println( TelaUtil.montarTituloTela("DEPOSITO") );
		System.out.println(" Informe o valor: ");
		Scanner scanner = new Scanner(System.in);
		valor = scanner.nextDouble();
		contaCtrl.depositar(valor);
	}

}
