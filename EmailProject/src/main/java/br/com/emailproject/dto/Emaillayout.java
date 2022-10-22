package br.com.emailproject.dto;

import br.com.emailproject.model.Email;

public class Emaillayout {
	
private static final String QUEBRA_DE_LINHA_DUPLA = "<br><br>";

private static final String QUEBRA_DE_LINHA_UNICA = "<br>";

	public Email montarEmailAdministrador(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Adminstrador")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
		.append("Solicito alteração de senha do sistema!")
		.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
	public Email montarEmailSecretario(String destinatario, String assunto) {
		
		StringBuilder texto = new StringBuilder();
		
		texto
			.append("A/C Secretário")
			.append(QUEBRA_DE_LINHA_DUPLA);
		
		texto
		.append("Texto personalizado para secretário!")
		.append(QUEBRA_DE_LINHA_DUPLA);
		
		gerarAssinatura(texto);
		
		gerarRodape(texto);
		
		return new Email(destinatario, assunto, texto.toString());
		
	}
	
	private String gerarAssinatura(StringBuilder texto) {
		return texto
				.append("Att.:")
				.append(QUEBRA_DE_LINHA_UNICA)
				.append("Operador de Caixa")
				.append(QUEBRA_DE_LINHA_DUPLA)
				.toString();
	}

	private String gerarRodape(StringBuilder texto) {
		return texto.append("E-mail automático. Favor não responder esse e-mail!").toString();
		
	}
	
}
