package br.edu.infnet.atmbancomoney.control;

import br.edu.infnet.atmbancomoney.view.Tela;
import br.edu.infnet.atmbancomoney.view.TelaDeposito;
import br.edu.infnet.atmbancomoney.view.TelaLogin;
import br.edu.infnet.atmbancomoney.view.TelaMenu;
import br.edu.infnet.atmbancomoney.view.TelaSaldo;
import br.edu.infnet.atmbancomoney.view.TelaSaque;

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
