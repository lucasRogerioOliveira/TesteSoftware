package Exceptions;

public class LetrasRepetidasException extends RuntimeException {
	
	public LetrasRepetidasException(){
		super("Existem letras inv�lidas sendo repetidas\n, as �nicas letras v�lidas que podem ser repetidas s�o: I,X,C e M");
	}

}
