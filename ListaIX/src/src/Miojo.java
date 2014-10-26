package src;

import java.util.HashMap;
import java.util.Map;

public class Miojo {
	private Map<Integer, Integer> repetidos = new HashMap<Integer, Integer>();
	private Integer aux = 0;
	private Integer total = 0;
	private Integer diferenca;
	private Boolean ehMenor = true;
	
	public Boolean Calcular(Integer valor, Boolean ehMenor, Integer tempoMiojo){
		if (diferenca == tempoMiojo){
			return true;
		}
		
		total += valor;
		diferenca -= valor;
		if (diferenca < 0){
			this.ehMenor = ehMenor;
			diferenca = Math.abs(diferenca);
		}
		aux = repetidos.get(diferenca) == null ? 0 : repetidos.get(diferenca);
		repetidos.put(diferenca, aux + 1);
		return false;
	}
	
	public int prepararMiojo(int tempoMiojo, int tempoAmpulheta1, int tempoAmpulheta2) {
		Integer maior = Math.max(tempoAmpulheta1, tempoAmpulheta2);
		Integer menor = Math.min(tempoAmpulheta1, tempoAmpulheta2);
		diferenca = maior;
		ehMenor = true;
		
		if(tempoMiojo >= tempoAmpulheta1 || tempoMiojo >= tempoAmpulheta2){
			throw new RuntimeException("Valor das ampulhetas devem ser maiores do que o tempo de preparo do miojo");
		}
		
		
		while(repetidos.get(diferenca) == null || repetidos.get(diferenca) <= 1){
			while (ehMenor){
				if (Calcular(menor, false, tempoMiojo)){
					return total;
				}
			}
			
			while (!ehMenor){
				if (Calcular(maior, true, tempoMiojo)){
					return total;
				}
			}			
		}
		
		return -1;
	}

}
