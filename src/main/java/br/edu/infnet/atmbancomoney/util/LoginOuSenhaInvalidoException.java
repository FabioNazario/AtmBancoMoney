package br.edu.infnet.atmbancomoney.util;

public class LoginOuSenhaInvalidoException extends Exception {

	public LoginOuSenhaInvalidoException() {
		super("Login ou senhas inválidos, verifique suas credencias e tente novamente");
	}
	
}
