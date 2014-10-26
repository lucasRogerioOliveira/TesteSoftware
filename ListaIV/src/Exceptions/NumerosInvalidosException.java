package Exceptions;

public class NumerosInvalidosException extends RuntimeException {
	
	public NumerosInvalidosException(){
		super("Números Inválidos. Você deve digitar apenas caracteres entre ´0 - 9 ou I,V,X,L,C,D,M");
	}
}
