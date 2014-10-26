package src;

import java.util.LinkedList;
import java.util.List;

public class Josephus {

	public static int sucidar(int pessoas, int inicio, int passo) {
		List<Integer> v = new LinkedList<Integer>();
		int index = inicio -1;
		
		for(int i=0; i<pessoas; i++){
			v.add(i+1);
		}
		
		validar(pessoas, inicio, passo);

		
		v.remove(index);
		while(v.size() > 1){
			index = (index + passo + 1) % v.size();
			v.remove(index);
			--index;
		}
		return v.get(0);
	}

	private static void validar(int pessoas, int inicio, int passo) {
		if(pessoas < 1){
			throw new RuntimeException("A quantidade de pessoas deve ser maior que zero!");
		}
		
		if(inicio < 1){
			throw new RuntimeException("A pessoa que irá começar o suicídio deve ser maior que zero");
		}
		
		if(passo < 0){
			throw new RuntimeException("A quantidade de passos deve ser maior ou igual a zero");
		}
	}
}  