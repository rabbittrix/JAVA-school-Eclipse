package br.com.xti.erros;

import java.security.PublicKey;

public class SenhaInvalidaException extends Exception {
	
	public SenhaInvalidaException(String mensagem) {
		super(mensagem);
	}

}
