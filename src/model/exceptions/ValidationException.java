package model.exceptions;

import java.util.HashMap;
import java.util.Map;

public class ValidationException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	// o Map � uma lista que define par de Chave/Valor
	private Map<String, String> errors = new HashMap<>();
	
	//Exce��o para validar um formul�rio
	public ValidationException(String msg) {
		super(msg);
	}
	
	public Map<String, String> getErrors(){
		return errors;
	}
	
	//M�todo para adicionar o erro na lista
	public void addError(String fieldName, String errorMessage) {
		errors.put(fieldName, errorMessage);
	}
	
}
