package br.com.db1.colecoes;

import java.util.Comparator;

import br.com.db1.colecoes.Carro;

public class MarcaComparator implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		return o1.getMarca().compareTo(o2.getMarca());
	}



}
