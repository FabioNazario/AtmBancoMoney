package br.edu.infnet.atmbancomoney.visao;

import java.util.Scanner;

import br.edu.infnet.atmbancomoney.control.HomeCtrl;
import br.edu.infnet.atmbancomoney.util.TelaUtil;

public class TelaMenu implements Tela {

	private int opcao;
	private HomeCtrl homeCtrl= new HomeCtrl();

	public void apresentar() {
                TelaUtil.limparTela();
		Scanner scanner = new Scanner(System.in);
                
                System.out.println( TelaUtil.montarTituloTela("MENU") );
                System.out.println("1 - Saldo");
                System.out.println("2 - Saque");
                System.out.println("3 - Deposito");
                System.out.println("4 - Extrato");
                System.out.println("5 - Sair");

                System.out.println(" Entre com a opcao: ");
                opcao = scanner.nextInt();
                
               homeCtrl.abrir(opcao);

	}

}
