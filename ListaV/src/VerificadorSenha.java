
public class VerificadorSenha {
	
	static Boolean senhaEhForte(String senha){
		
		return !senha.matches(".*([\\w\\W])\\1.*") //valida se existe alguma sequencia repetida
			&& senha.matches(".*[!@#$%&*;:+=].*[!@#$%&*;:+=].*")//valida se existe mais de um caracter especial
			&& senha.matches(".*[0-9].*[0-9].*")//valida se existe mais de um digito numérico
			&& senha.length() >= 6;
	}

}
