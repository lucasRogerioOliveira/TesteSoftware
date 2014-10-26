package Exceptions;

public class NumerosMisturadosException extends RuntimeException {
	
	public NumerosMisturadosException(){
		super("Existem n�meros misturados, escolha entre o formato 'indo-ar�bicos' (0 - 9) ou 'romanos' (I,V,X,L,C,D,M)");
	}
}
