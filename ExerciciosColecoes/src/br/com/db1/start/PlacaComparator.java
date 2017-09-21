package br.com.db1.start;

import java.util.Comparator;

import br.com.db1.colecoes.Carro;

public class PlacaComparator implements Comparator<Carro> {

		@Override
		public int compare(Carro o1, Carro o2) {
			return o1.getPlaca().compareTo(o2.getPlaca());
		}

}