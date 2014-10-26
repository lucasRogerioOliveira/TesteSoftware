
import Exceptions.CaracteresInvalidosException;
import Exceptions.TamanhoCpfInvalidoException;


public class ValidadorCpf {
	 
	public Boolean validarCPF(String cpf){
		Integer m[][] = new Integer[10][3];
		if (!cpf.matches("[0-9]*"))
			throw new CaracteresInvalidosException();		
		if (cpf.length() < 11 || cpf.length() > 11)
			throw new TamanhoCpfInvalidoException("O CPF deve conter 11 caracteres numéricos!");
		Integer somatoria = 0, resto = 0, digVerf1, digVerf2;
		for (Integer i = 0; i < 9; i++){
			Integer digito = Integer.parseInt(cpf.substring(i,i+1));
			m[i][0] = digito;
			m[i][1] = 10 - i;
			m[i][2] = m[i][1] * digito;
			somatoria += m[i][2];
		}
		resto = somatoria % 11;
		somatoria = 0;
		digVerf1 = (resto < 2 ? 0 : 11 - resto);
		for (Integer i = 0; i < 9; i++){
			Integer digito = Integer.parseInt(cpf.substring(i,i+1));
			m[i][0] = digito;
			m[i][1] = 11-i;
			m[i][2] = m[i][1] * digito;
			somatoria += m[i][2];
		}
		m[9][2] = digVerf1 * 2;
		somatoria += m[9][2];
		digVerf2 = (resto < 2 ? 0 : 11 - resto);
		return cpf.substring(9,11).equals(digVerf1.toString() + digVerf2.toString());
	}
}
