
import java.util.HashMap;
import java.util.Map;

import utils.Matematica;
import utils.Texto;
import Exceptions.EmptyStringException;
import Exceptions.LetrasRepetidasException;
import Exceptions.NumerosInvalidosException;
import Exceptions.NumerosMisturadosException;

public class ConversorNumerico extends Matematica{
	
	private Map<String, Integer> grandesa;
		
	public ConversorNumerico(){
		grandesa = new HashMap<String, Integer>();
		grandesa.put("I", 1);
		grandesa.put("V", 5);
		grandesa.put("X", 10);
		grandesa.put("L", 50);
		grandesa.put("C", 100);
		grandesa.put("D", 500);
		grandesa.put("M", 1000);
	}
	
	private Boolean numerosValidos(String numero){
		return  numero.matches("[0-9]*");
	}
	
	private Boolean letrasRepetidas(String value){
		return (value.contains("IIII") || value.contains("XXXX") || value.contains("CCCC") || value.contains("MMMM") 
			|| value.contains("VV") || value.contains("LL") || value.contains("DD"));
	}
	
	private TipoNumero identificarNumero(String value){
		Boolean roman = value.matches("[IVXLCDM]*");
		Boolean indoArabe = value.matches("[0-9]*"); 
		if (!roman && !indoArabe)
			if (value.matches("[IVXLCDM0-9]*"))
				return TipoNumero.Misturado;
			else
				return TipoNumero.Invalido;
		return (roman ? TipoNumero.Romano : TipoNumero.IndoArabe );
	}
	
	public Boolean isValidNumber(String numero){
		if (numero == null || numero.isEmpty())
			throw new EmptyStringException();
		TipoNumero tpNum = identificarNumero(numero);
		if (tpNum.equals(TipoNumero.IndoArabe)){
			if (!numerosValidos(numero))
				throw new NumerosInvalidosException();			
		}
		if (tpNum.equals(TipoNumero.Romano)){
			if (letrasRepetidas(numero))
				throw new LetrasRepetidasException();			
		}
		if (tpNum.equals(TipoNumero.Misturado))
			throw new NumerosMisturadosException();
		if (tpNum.equals(TipoNumero.Invalido))
			throw new NumerosInvalidosException();
		return true;
	}
	
	public String Convert(Integer v){
		//127 = CXXVII
		//104 = CIV
		//144 = CIVIV
		//4444 = MMMMCDXLIV
		Integer value = v;
		if (numerosValidos(value.toString())){
			String result = "";
			Integer div = 0; 
			result += Texto.repeat("M",Matematica.divideERetornaResto(value, 1000));
			value %=  1000;
			
			result += Texto.repeat("D",Matematica.divideERetornaResto(value, 500));
			value %=  500;
			
			div = Matematica.divideERetornaResto(value, 100);
			value %=  100;
			result += (div > 3 ? "CD" : Texto.repeat("C", div));
			
			result += Texto.repeat("L", Matematica.divideERetornaResto(value, 50));
			value %=  50;
			
			div = Matematica.divideERetornaResto(value, 10);
			value %=  10;
			result += (div > 3 ? "XL" : Texto.repeat("X", div));
			
			result += Texto.repeat("V", Matematica.divideERetornaResto(value, 5));
			
			div = Matematica.divideERetornaResto(value, 1);
			result += (div > 3 ? "IV" : Texto.repeat("I", div));
			
			return result;
		} else {
			throw new NumerosInvalidosException();
		}		
	}
	
	public Integer Convert(String value){
		if (isValidNumber(value)){
			Integer i, length = value.length();
			Integer uni, total = 0;
			//XIII IIIX
			for (i = 0; i < length-1; i++){
				uni = grandesa.get(value.substring(i,i+1));
				total = (uni >= grandesa.get(value.substring(i+1,i+2)) ? total + uni : total - uni);
			}
			total += grandesa.get(value.substring(i,i+1));
			
			return total;
		} else {
			throw new NumerosInvalidosException();
		}
	}
}
