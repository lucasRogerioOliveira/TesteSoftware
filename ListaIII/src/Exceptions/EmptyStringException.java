package Exceptions;

public class EmptyStringException extends RuntimeException{
	
	public EmptyStringException(){
		super("Não foi atribuido nenhum numero");
	}

}
