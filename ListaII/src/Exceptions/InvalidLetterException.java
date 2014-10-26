package Exceptions;

public class InvalidLetterException extends RuntimeException {
	
	public InvalidLetterException(Integer position) {
		super("Letra inv�lida" + (position.equals(null) ? "" : "na posi��o " + position));
	}
}
