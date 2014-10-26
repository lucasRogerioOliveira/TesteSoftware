package utils;


public class Matematica {
	
	public static Integer pow(Integer num, Integer qtd){
		Integer resultado = num;
		for (int i = 1; i < qtd; i++ ) {
			resultado *= num;
		}
		return resultado;
	}
	
	public static Boolean isPrimeNumber(Integer numero){
		Integer raiz = (int) Math.sqrt(Double.parseDouble(numero.toString()));
		for (int i = 2; i <= raiz; i += 2){
			if (numero % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static Integer divideERetornaResto(Integer valor, Integer dividirPor){ 
		Integer result = valor / dividirPor;
		valor = valor % dividirPor;
		return result;
	}
	
}
