package br.com.db1.colecoes.test;

import java.util.Comparator;

import br.com.db1.colecoes.Produto;

public class ProdutoComparetor implements Comparator<Produto>{

	@Override
	public int compare(Produto produto, Produto outroProduto) {
		return produto.getDescricao()
				.compareTo(outroProduto.getDescricao());
	}


}
