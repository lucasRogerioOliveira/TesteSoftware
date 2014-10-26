

import java.util.LinkedList;
import java.util.List;

public class NumeroFeliz {
	/*
	1.  Determine se um n�mero � feliz.
	Para saber se um n�mero � feliz, voc� deve obter o quadrado de cada d�gito deste 
	n�mero, em seguida voc� faz a soma desses resultados. A seguir o mesmo 
	procedimento deve ser feito com o valor resultante desta soma. Se ao repetir o 
	procedimento diversas vezes obtivermos o valor 1, o n�mero inicial � considerado feliz.
	Tomamos o 7, que � um n�mero feliz:
	7� = 49
	4� + 9� = 97
	9� + 7� = 130
	1� + 3� + 0� = 10
	1� + 0� = 1 
	Podemos observar nesse exemplo que os n�meros 49, 97, 130 e 10 tamb�m s�o felizes. 
	Existem infinitos n�meros felizes.
	E um n�mero triste? Como sabemos que um n�mero n�o ser� feliz?
	Desenvolva um programa que determine se um n�mero � feliz ou triste.
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