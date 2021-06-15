package br.edu.infnet.atmbancomoney.control;

import br.edu.infnet.atmbancomoney.model.Conta;
import br.edu.infnet.atmbancomoney.util.LoginOuSenhaInvalidoException;
import br.edu.infnet.atmbancomoney.view.TelaMenu;

public class LoginCtrl {

	public static Conta conta;

	public void login(String conta, String pin) throws LoginOuSenhaInvalidoException {
	
            //TO-DO: Modificar para fazer do banco
            if (conta.equals("12345") && pin.equals("67890")) {
			this.conta = new Conta(conta, pin);
			TelaMenu menu = new TelaMenu();
			menu.apresentar();
			return;
		}

		throw new LoginOuSenhaInvalidoException();
	}

}
