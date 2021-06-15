package br.edu.infnet.atmbancomoney.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	
	private String numero;
	
	private String pin;
	
	private double saldo;
	
	private List<Transacao> transacoes = new ArrayList<Transacao>();
	
	public Conta(String numero, String pin) {
		this.numero = numero;
		this.pin = pin;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getNumero() {
		return this.numero;
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void sacar(double valorSaque) {
		this.saldo -= valorSaque;
	}

	public List<Transacao> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<Transacao> transacoes) {
		this.transacoes = transacoes;
	}

	public void addTransacao(Transacao transacao) {
		if(getTransacoes() == null) {
			this.transacoes = new ArrayList<Transacao>();
		}
		getTransacoes().add(transacao);
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", pin=" + pin + ", saldo=" + saldo + ", transacoes=" + transacoes + "]";
	}
	

}
