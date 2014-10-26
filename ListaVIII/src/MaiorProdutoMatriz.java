

import java.util.Scanner;

public class MaiorProdutoMatriz {
	private Integer n;
	private Integer matriz[][];
		
	public void lerMatriz(){
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		matriz = new Integer[n][n];
		for(Integer i = 0; i<n; i++){
			for(Integer j = 0; j<n; j++){
				matriz[i][j] = s.nextInt();
			}
		}
		System.out.println("**fim**\n");
	}
	
	public void mostrarMatriz(){
		System.out.println("valor de N:");
		System.out.println(n);
		for(Integer i = 0; i<n; i++){
			for(Integer j = 0; j<n; j++){
				System.out.print(matriz[i][j]);
			}
			System.out.print("\n");
		}
	}
	
	public Integer maiorProdutoMatriz(){
		mostrarMatriz();
		Integer maiorProduto = 0, prodLinha = 1, prodColuna = 1, i = 0, j = 0, k = 0;
		//verificando o produto das linhas e colunas... como ela é quadrada podemos fazer isso.
		System.out.println("verificando maior produto das linhas e colunas.");
		for (i = 0; i<n; i++){
			for(j = 0; j<n; j++){
				prodLinha  *= matriz[i][j];
				prodColuna *= matriz[j][i];
			}
			if(maiorProduto < Math.max(prodLinha,prodColuna))
				maiorProduto = Math.max(prodLinha,prodColuna);
		}
		System.out.println("maior Produto linha e coluna");
		System.out.println(maiorProduto);
		
		//verificando as diagonais... da esquerda pra direita de cima pra baixo
		prodLinha = 1;
		prodColuna = 1;
		for (i = 0; i<n; i++){
			for(j = i; j<n; j++){
				prodLinha *= matriz[j][j-i];
				prodColuna *= matriz[j-i][j];
			}
			if(maiorProduto < Math.max(prodLinha,prodColuna))
				maiorProduto = Math.max(prodLinha,prodColuna);			
		}
		prodLinha = 1;
		prodColuna = 1;
		//verificando as diagonais... da direita pra esquerda de cima pra baixo
		System.out.println("maior Produto linha diagonais");
		for (i = 0; i>=n; i++){
			for(j = n-i; j>=0; --j){
				prodLinha *= matriz[(n-1)-j][j]; // pegando 
				prodColuna *= matriz[j][(n-1)-j];
			}
			if(maiorProduto < Math.max(prodLinha,prodColuna))
				maiorProduto = Math.max(prodLinha,prodColuna);			
		}
		System.out.println(maiorProduto);
		return maiorProduto;
	}	
}
