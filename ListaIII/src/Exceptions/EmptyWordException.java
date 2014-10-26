package Exceptions;

public class EmptyWordException extends RuntimeException {
	
	public EmptyWordException() {
		super("A palavra deve conter ao menos um caracter entre [a-z,A-Z]");
	}

}
