

import java.util.HashMap;
import java.util.Map;

public class DescontoLivraria {
	
	//livro e qtd;
	private Map<Livro,Integer> carrinho;
	
	public DescontoLivraria(){
		carrinho = new HashMap<Livro, Integer>();
	}
	
	//quero melhorar o desconto...
	private Integer mochilaBinaria(Integer livros){
		Integer desconto2 = 0, desconto3 = 0, desconto4 = 0, desconto5 = 0;
		if (livros <= 1) return 0;
		if (livros / 5 > 0) desconto5 = (livros / 5) * 20 + mochilaBinaria(livros % 5);
		if (livros / 4 > 0)	desconto4 = (livros / 4) * 15 + mochilaBinaria(livros % 4);
		if (livros / 3 > 0)	desconto3 = (livros / 3) * 10 + mochilaBinaria(livros % 3);
		if (livros / 2 > 0)	desconto2 = (livros / 2) *  5 + mochilaBinaria(livros % 2);
		return Math.max(desconto5, Math.max(desconto4, Math.max(desconto3, desconto2)));
	}
	
	public Double calcularValorComDesconto(){
		Double precoTotal = 0D; 
		Integer totalLivros = 0;
		for(Livro l: carrinho.keySet()){
			precoTotal += carrinho.get(l) * 42D;
			totalLivros += carrinho.get(l);
		}
		Integer descontoPer = mochilaBinaria(totalLivros);
		Double desconto = (precoTotal * descontoPer) / 100;
		System.out.println("desconto");
		System.out.println(descontoPer);
		System.out.println("total livros");
		System.out.println(totalLivros);
		System.out.println("total desconto");
		System.out.println(precoTotal - desconto);
		return precoTotal - desconto;
	}
	
	//gets and sets
	public void setCarrinho(Map carrinho){
		this.carrinho = carrinho;		
	}
	
	public Map<Livro,Integer> getCarrinho(){
		return carrinho;
	}

}

