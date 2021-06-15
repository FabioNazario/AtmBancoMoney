package br.edu.infnet.atmbancomoney.model;

public enum TipoTransacao {
	
	DEBITO("-"), CREDITO("+");
	
	private String sinal;

	private TipoTransacao(String sinal) {
		this.sinal = sinal;
	}
	
	public String getSinal() {
		return this.sinal;
	}
	
	
	

}
