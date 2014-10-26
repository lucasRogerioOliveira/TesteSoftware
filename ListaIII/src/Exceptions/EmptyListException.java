package Exceptions;

public class EmptyListException extends RuntimeException {
	
	public EmptyListException(){
		super("A lista está vazia!");
	}

}
