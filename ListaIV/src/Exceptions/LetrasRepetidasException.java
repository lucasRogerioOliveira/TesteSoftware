package Exceptions;

public class LetrasRepetidasException extends RuntimeException {
	
	public LetrasRepetidasException(){
		super("Existem letras inválidas sendo repetidas\n, as únicas letras válidas que podem ser repetidas são: I,X,C e M");
	}

}
