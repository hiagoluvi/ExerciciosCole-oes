package br.com.db1.colecoes;

import java.util.Comparator;

public class ProdutoComparator implements Comparator<Produto>{

	@Override
	public int compare(Produto produto, Produto outroProduto) {
		return produto.getDescricao()
				.compareTo(outroProduto.getDescricao());
	}



}
