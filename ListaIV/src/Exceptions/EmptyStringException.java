package Exceptions;

public class EmptyStringException extends RuntimeException{
	
	public EmptyStringException(){
		super("N�o foi atribuido nenhum numero");
	}

}
