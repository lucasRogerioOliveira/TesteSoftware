

public class LusesCorredor {
	
	Integer luses;
	Boolean interruptores[];
	
	public LusesCorredor(Integer luses){
		this.luses = luses;
		interruptores = new Boolean[this.luses];
		for (Integer i = 0; i<luses; i++) interruptores[i] = false;
	}
	
	public void passarPeloCorredor(){
		for(Integer numPassagem=1; numPassagem<=luses; numPassagem++){
			for(Integer posicaoLampada=1; posicaoLampada<=luses; posicaoLampada++){
				if(posicaoLampada % numPassagem == 0){
					interruptores[posicaoLampada-1] = !interruptores[posicaoLampada-1]; 
				}
			}
		}
	}
	
	public Integer getLuses(){
		return luses;
	}
	
	public void setLuses(Integer l){
		luses = l;
	}

}
