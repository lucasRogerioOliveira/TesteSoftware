package Exceptions;

public class InvalidLetterException extends RuntimeException {
	
	public InvalidLetterException(Integer position) {
		super("Letra inválida" + (position.equals(null) ? "" : "na posição " + position));
	}
}
