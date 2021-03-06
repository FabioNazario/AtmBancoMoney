package br.edu.infnet.atmbancomoney.control;

import java.util.List;

import br.edu.infnet.atmbancomoney.model.ContaService;
import br.edu.infnet.atmbancomoney.util.SaldoInsuficienteException;

public class ContaCtrl {
	
	private ContaService contaService = new ContaService();
	
	public double getSaldo() {
		String contaNumero = LoginCtrl.conta.getNumero();
		return contaService.getSaldoConta(contaNumero);
	}

	public void depositar(double valor) {
		String contaNumero = LoginCtrl.conta.getNumero();
		contaService.deposita(contaNumero, valor);
	}

	public String sacar(double valorSaque) {
		String contaNumero = LoginCtrl.conta.getNumero();
		try {
			return contaService.sacar(valorSaque, contaNumero);
		} catch (SaldoInsuficienteException e) {
			return e.getMessage();
		}
	}
}
