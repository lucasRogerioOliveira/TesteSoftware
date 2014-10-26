package utils;


public class Texto {
	public static Boolean isLetter(char letter){
		return ((letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122));
	}
	
	public static String repeat(String value, Integer qtd){
		String result = "";
		while(qtd > 0) {
			qtd -= 1;
			result += value;
		}
		return result;
	}
}
