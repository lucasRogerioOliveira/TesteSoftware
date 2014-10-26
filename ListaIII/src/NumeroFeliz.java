

import java.util.LinkedList;
import java.util.List;

public class NumeroFeliz {
	/*
	1.  Determine se um número é feliz.
	Para saber se um número é feliz, você deve obter o quadrado de cada dígito deste 
	número, em seguida você faz a soma desses resultados. A seguir o mesmo 
	procedimento deve ser feito com o valor resultante desta soma. Se ao repetir o 
	procedimento diversas vezes obtivermos o valor 1, o número inicial é considerado feliz.
	Tomamos o 7, que é um número feliz:
	7² = 49
	4² + 9² = 97
	9² + 7² = 130
	1² + 3² + 0² = 10
	1² + 0² = 1 
	Podemos observar nesse exemplo que os números 49, 97, 130 e 10 também são felizes. 
	Existem infinitos números felizes.
	E um número triste? Como sabemos que um número não será feliz?
	Desenvolva um programa que determine se um número é feliz ou triste.
	*/
	static List<Integer> numerosDaSeq;
		
	public static boolean verificaNumeroFeliz(int numero) {
		numerosDaSeq = new LinkedList<Integer>();
		
		while(numero != 1) {
			int soma = 0;
			numerosDaSeq.add(numero);
			while(numero/10 != 0 || numero%10 != 0) {
				soma += Math.pow(numero%10, 2);
				numero = numero/10;
			}
			
			numero = soma;
			
			if(numerosDaSeq.contains(soma)){
				break;
			}
		}
		
		System.out.println(numero);
		return numero == 1;
	}
}