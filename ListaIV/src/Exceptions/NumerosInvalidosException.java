package Exceptions;

public class NumerosInvalidosException extends RuntimeException {
	
	public NumerosInvalidosException(){
		super("N�meros Inv�lidos. Voc� deve digitar apenas caracteres entre �0 - 9 ou I,V,X,L,C,D,M");
	}
}
