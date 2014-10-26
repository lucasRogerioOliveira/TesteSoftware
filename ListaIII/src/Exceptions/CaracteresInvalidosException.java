package Exceptions;

public class CaracteresInvalidosException extends RuntimeException {
	
	public CaracteresInvalidosException(){
		super("O cpf deve conter 11 dígitos");
	}

}
