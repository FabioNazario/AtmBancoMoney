package br.edu.infnet.atmbancomoney.view;

import java.util.Scanner;

import br.edu.infnet.atmbancomoney.control.LoginCtrl;
import br.edu.infnet.atmbancomoney.util.TelaUtil;
import br.edu.infnet.atmbancomoney.util.LoginOuSenhaInvalidoException;

public class TelaLogin implements Tela {

	private String conta;
	private String pin;
	private LoginCtrl loginCtrl = new LoginCtrl();

	public void apresentar()  {
                TelaUtil.limparTela();
		Scanner scan = new Scanner(System.in);
		System.out.println( TelaUtil.montarTituloTela("BEM-VINDO AO BANCO MONEY!") );
		
		System.out.println("Número da conta: ");
		conta = scan.next();
		System.out.println("Pin: ");
		pin = scan.next();

		try {
			loginCtrl.login(conta, pin);
		} catch (LoginOuSenhaInvalidoException e) {
			System.out.println(e.getMessage());
                        TelaUtil.exibirAperteEnterParaContinuar();
			apresentar();
		}

	}

}
