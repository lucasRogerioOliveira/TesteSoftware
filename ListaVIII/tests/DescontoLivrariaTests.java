

import junit.framework.Assert;

import org.junit.BeforeClass;
import org.junit.Test;

public class DescontoLivrariaTests {
	
	private static DescontoLivraria dl;
	
	@BeforeClass
	public static void init(){
		dl = new DescontoLivraria();
	}
	
	@Test
	public void calculaDesconto8Livros(){
		dl.getCarrinho().clear();
		dl.getCarrinho().put(Livro.livro1, 2);
		dl.getCarrinho().put(Livro.livro2, 2);
		dl.getCarrinho().put(Livro.livro3, 2);
		dl.getCarrinho().put(Livro.livro4, 1);
		dl.getCarrinho().put(Livro.livro5, 1);
		Assert.assertEquals(235.20, dl.calcularValorComDesconto(),0);		
	}

	@Test
	public void calculaDescontoCom11LivrosTest() {
		dl.getCarrinho().clear();
		dl.getCarrinho().put(Livro.livro1, 1);
		dl.getCarrinho().put(Livro.livro2, 2);
		dl.getCarrinho().put(Livro.livro3, 1);
		dl.getCarrinho().put(Livro.livro4, 6);
		dl.getCarrinho().put(Livro.livro5, 1);
		Assert.assertEquals(277.20, dl.calcularValorComDesconto());				
	}
	
	@Test
	public void calculaDescontoCom17LivrosTest() {
		dl.getCarrinho().clear();
		dl.getCarrinho().put(Livro.livro1, 4);
		dl.getCarrinho().put(Livro.livro3, 3);
		dl.getCarrinho().put(Livro.livro4, 4);
		dl.getCarrinho().put(Livro.livro5, 3);
		dl.getCarrinho().put(Livro.livro7, 3);
		Assert.assertEquals(249.90, dl.calcularValorComDesconto());		
	}

	@Test
	public void calculaDescontoCom20LivrosTest() {
		dl.getCarrinho().clear();
		dl.getCarrinho().put(Livro.livro1, 3);
		dl.getCarrinho().put(Livro.livro2, 3);
		dl.getCarrinho().put(Livro.livro3, 3);
		dl.getCarrinho().put(Livro.livro4, 3);
		dl.getCarrinho().put(Livro.livro5, 3);
		dl.getCarrinho().put(Livro.livro6, 3);
		dl.getCarrinho().put(Livro.livro7, 2);
		Assert.assertEquals(168.00, dl.calcularValorComDesconto());		
	}
}
