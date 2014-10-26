package Exceptions;

public class NumerosMisturadosException extends RuntimeException {
	
	public NumerosMisturadosException(){
		super("Existem números misturados, escolha entre o formato 'indo-arábicos' (0 - 9) ou 'romanos' (I,V,X,L,C,D,M)");
	}
}
