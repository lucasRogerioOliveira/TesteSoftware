


public class AnoBissexto {
	
	public static Boolean ehBissexto(Integer numero){
		return (numero % 4 == 0) && (numero % 100 != 0) || (numero % 400 == 0);
	}
}
