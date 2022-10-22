package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class Emaillayout {

	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
}
