

import java.util.LinkedList;
import java.util.List;

import Exceptions.EmptyListException;


public class SequenciaNumerica {
	
	private List<Integer> list;
	
	public SequenciaNumerica(){
		list = new LinkedList<Integer>();
	}
	
	public Boolean add(Integer value){
		return list.add(value);		
	}
	
	public Integer size(){
		return list.size();
	}
	
	public Integer min(){
		if (list.isEmpty())
			throw new EmptyListException(); 
		Integer min = list.get(0);
		Integer size = size();
		for (Integer i = 1; i < size; i++){
			if (min > list.get(i))
				min = list.get(i);
		}
		return min;
	}
	
	public Integer max(){
		if (list.isEmpty())
			throw new EmptyListException(); 
		Integer max = list.get(0);
		Integer size = size();
		for (Integer i = 1; i < size; i++){
			if (max < list.get(i))
				max = list.get(i);
		}
		return max;
	}
	
	public Double media(){
		Integer mod = 0;
		Integer size = size();
		for (Integer i = 0; i < size; i++){
			mod += list.get(i);
		}
		return mod.doubleValue() / size;
	}
	
	
	//gets and sets
	public List<Integer> getLista(){
		return list;
	}
	
	public void setLista(List<Integer> lista){
		this.list = lista;
	}

}
