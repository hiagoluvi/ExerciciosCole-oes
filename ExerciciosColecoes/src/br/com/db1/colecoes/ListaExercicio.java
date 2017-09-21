package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaExercicio {
	List<String> vogais2 = new ArrayList<>();
	List<String> vogais3 = new ArrayList<>();
	List<Integer> numeros = new ArrayList<>();

	public ListaExercicio() {
		vogais2.add("a");
		vogais2.add("e");
		vogais2.add("i");
		vogais2.add("o");
		vogais2.add("u");

		vogais3.add("b");
		vogais3.add("c");
		vogais3.add("d");
		vogais3.add("f");
		vogais3.add("g");
		vogais3.add("h");
		vogais3.add("j");
		vogais3.add("k");
		vogais3.add("l");
		vogais3.add("m");
		vogais3.add("n");
		vogais3.add("p");
		vogais3.add("q");
		vogais3.add("r");
		vogais3.add("s");
		vogais3.add("t");
		vogais3.add("v");
		vogais3.add("w");
		vogais3.add("x");
		vogais3.add("y");
		vogais3.add("z");

		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
	}

	public Set<String> getVogais(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> vogaisEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (vogais2.contains(letra)) {
				vogaisEncontradas.add(letra);
			}
		}

		return vogaisEncontradas;
	}

	public Set<String> getConsoantes(String nomeParametro) {
		nomeParametro = nomeParametro.toLowerCase();
		Set<String> consoantesEncontradas = new HashSet<>();

		for (Integer x = 0; x < nomeParametro.length(); x++) {
			String letra = nomeParametro.substring(x, x + 1);
			if (vogais3.contains(letra)) {
				consoantesEncontradas.add(letra);
			}
		}

		return consoantesEncontradas;

	}

	public List<Integer> removeTerceiraPosicao(List<Integer> valores) {
		valores.remove(2);
		return valores;
	}

	public List<Integer> getNumerosPares(List<Integer> valores) {
		List<Integer> valoresMultiplosDeDois = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while (it.hasNext()) {
			Integer valor = it.next();

			if (valor > 0 && valor % 2 == 0) {
				valoresMultiplosDeDois.add(valor);
			}
		}
		return valoresMultiplosDeDois;
	}
	
	

}
