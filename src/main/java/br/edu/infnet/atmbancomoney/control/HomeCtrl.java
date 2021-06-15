package br.edu.infnet.atmbancomoney.control;

import br.edu.infnet.atmbancomoney.visao.Tela;
import br.edu.infnet.atmbancomoney.visao.TelaDeposito;
import br.edu.infnet.atmbancomoney.visao.TelaExtrato;
import br.edu.infnet.atmbancomoney.visao.TelaLogin;
import br.edu.infnet.atmbancomoney.visao.TelaMenu;
import br.edu.infnet.atmbancomoney.visao.TelaSaldo;
import br.edu.infnet.atmbancomoney.visao.TelaSaque;

public class HomeCtrl {
	
	private Tela tela;
	
	public void abrir(int opcao) {
		
		switch (opcao) {
			case 1:
				tela = new TelaSaldo();
				break;
			case 2:
				tela = new TelaSaque();
				break;
			case 3:
				tela = new TelaDeposito();
				break;
			case 4:
				tela = new TelaExtrato();
				break;
                        case 5:
                                tela = new TelaLogin();
                                break;
			default:
                                tela = new TelaMenu(); 
				break;
		}
		
		tela.apresentar();
                
                tela = new TelaMenu(); 
                tela.apresentar();
		
	}

}
