package Exceptions;

public class EmptyListException extends RuntimeException {
	
	public EmptyListException(){
		super("A lista est� vazia!");
	}

}
