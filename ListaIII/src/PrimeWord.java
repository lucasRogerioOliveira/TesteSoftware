

import utils.Matematica;
import utils.Texto;
import Exceptions.EmptyWordException;
import Exceptions.InvalidLetterException;

public class PrimeWord {

	private String word;
	
	public PrimeWord(){
	}
	
	public Boolean isPrime(){ //palavra é prima
		int sum = 0;
		for (int i = 0; i < word.length(); i++){
			System.out.println(word.charAt(i));
			sum += valueOfLetter(word.charAt(i));
		}
		return  (sum == 0 ? false : Matematica.isPrimeNumber(sum));
	}
	
	private int valueOfLetter(char letter){
		int v = letter; 
		if (letter >= 65 && letter <= 90) //A - Z
			return v - 38;
		if(letter >= 97 && letter <= 122) //a - z
			return v - 96; //(97 - 26)
		throw new InvalidLetterException(null);
	}
	
	private Boolean validWord(){
		for (int i = 0; i < word.length(); i++)
			if (!Texto.isLetter(word.charAt(i)))
				throw new InvalidLetterException(i);
		if (word.isEmpty()){
			throw new EmptyWordException();
		}
		return true;
	}
	
	//gets and sets
	
	public String getWord(){
		return word;
	}
	
	public void setWord(String Palavra){
		word = Palavra;
		if (!validWord()){
			word = null;
		}
	}

}
