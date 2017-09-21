package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.Carro;
import br.com.db1.colecoes.ListaExercicio;
import br.com.db1.colecoes.MarcaComparator;
import br.com.db1.colecoes.Produto;

import br.com.db1.start.PlacaComparator;

public class ListaExercicioTest {

	private ListaExercicio exercicio;
	private int x;

	@Before
	public void iniciar() {
		exercicio = new ListaExercicio();
	}

	@Test
	public void getVogaisTest() {
		Set<String> vogais = exercicio.getVogais("Fusca");
		Assert.assertTrue(vogais.size() == 2);
		Assert.assertFalse(vogais.contains("F"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = exercicio.getConsoantes("Fusca");
		Assert.assertTrue(consoantes.size() == 3);
		Assert.assertTrue(consoantes.contains("f"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}

	@Test
	public void exercicio3Test() {
		List<Integer> valores = new ArrayList<>();
		for (Integer x = 0; x < 10; x++) {
			valores.add(x * 10);
		}

		Assert.assertTrue(valores.contains(0));
		Assert.assertTrue(valores.contains(10));
		Assert.assertTrue(valores.contains(20));
		Assert.assertTrue(valores.contains(30));

		List<Integer> novosValores = exercicio.removeTerceiraPosicao(valores);
		Assert.assertTrue(novosValores.contains(0));
		Assert.assertTrue(novosValores.contains(10));
		Assert.assertFalse(novosValores.contains(20));
		Assert.assertTrue(novosValores.contains(30));

	}

	@Test
	public void exercicio4Test() {
		List<Integer> valores = new ArrayList<>();
		for (Integer x = 0; x < 10; x++) {
			valores.add(x * 10);
		}

		Assert.assertTrue(valores.get(3) == 30);
		Assert.assertTrue(valores.get(6) == 60);
		Assert.assertTrue(valores.get(9) == 90);

	}

	@Test
	public void exercicio5Test() {
		List<Integer> valores = new ArrayList<>();
		for (Integer x = 0; x < 10; x++) {
			valores.add(x);
		}

		List<Integer> novaLista = exercicio.getNumerosPares(valores);

		Assert.assertTrue(novaLista.contains(2));
		Assert.assertTrue(novaLista.contains(4));
		Assert.assertTrue(novaLista.contains(6));
		Assert.assertTrue(novaLista.contains(8));
		Assert.assertFalse(novaLista.contains(10));
		Assert.assertFalse(novaLista.contains(3));

	}

	@Test
	public void exercicio6Test() {
		List<String> nomes = new ArrayList<>();
		nomes.add("silas");
		nomes.add("gustavo");
		nomes.add("aline");
		nomes.add("izabela");
		nomes.add("gabriel");
		nomes.add("lorena");
		nomes.add("lucas");
		nomes.add("caio");
		nomes.add("leonardo");
		nomes.add("fernando");

		List<String> novaLista = new ArrayList<>(nomes);

		Assert.assertTrue(novaLista.contains("caio"));
	}

	@Test
	public void exercicio7Test() {
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("preto");

		List<String> cores2 = new ArrayList<>();
		cores2.add("azul");
		cores2.add("vermelho");
		cores2.add("preto");

		Assert.assertFalse(cores.equals(cores2));

		cores2.add("laranja");
		Assert.assertFalse(cores.equals(cores2));

		Assert.assertTrue(cores.containsAll(cores2));

		// Collections.sort(cores);
		// Collections.sort(cores2);
		// Assert.assertTrue(cores.equals(cores2));

	}

	@Test
	public void exercicio8Test() {
		Set<String> cores = new HashSet<>();
		cores.add("azul");
		cores.add("vermelho");
		cores.add("laranja");
		cores.add("preto");

		Set<String> cores2 = new HashSet<>();
		cores2.add("azul");
		cores2.add("vermelho");
		cores2.add("preto");

		Assert.assertFalse(cores.equals(cores2));

		cores2.add("laranja");
		Assert.assertTrue(cores.equals(cores2));

	}

	@Test
	public void exercicio9e10Test() {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(98, "CELULAR", 1000.00));
		produtos.add(new Produto(50, "MONITOR", 200.00));
		produtos.add(new Produto(55, "CANECA", 50.00));

		Assert.assertTrue(produtos.size() == 3);
		Assert.assertTrue(produtos.get(0).getValor() == 1000.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 50.00);

		Collections.sort(produtos);

		Assert.assertTrue(produtos.get(0).getValor() == 50.00);
		Assert.assertTrue(produtos.get(1).getValor() == 200.00);
		Assert.assertTrue(produtos.get(2).getValor() == 1000.00);

		Collections.sort(produtos, new ProdutoComparetor());

		Assert.assertEquals("CANECA", produtos.get(0).getDescricao());
		Assert.assertEquals("CELULAR", produtos.get(1).getDescricao());
		Assert.assertEquals("MONITOR", produtos.get(2).getDescricao());

	}
	
	@Test
	public void test(){
		List<Carro> carros = new ArrayList<>();
		carros.add(new Carro(1972, "Fusca", "VW", "DAD-1234"));
		carros.add(new Carro(2017, "Ecosport", "Ford", "ABC-9999"));
		carros.add(new Carro(2016, "Uno", "Fiat", "ABC-1890"));

		Assert.assertTrue(carros.size() == 3);
		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2017);
		Assert.assertTrue(carros.get(2).getAno() == 2016);
		
		Collections.sort(carros);

		Assert.assertTrue(carros.get(0).getAno() == 1972);
		Assert.assertTrue(carros.get(1).getAno() == 2016);
		Assert.assertTrue(carros.get(2).getAno() == 2017);

		Collections.sort(carros, new MarcaComparator());

		Assert.assertEquals("Fiat",carros.get(0).getMarca());
		Assert.assertEquals("Ford",carros.get(1).getMarca());
		Assert.assertEquals("VW",carros.get(2).getMarca());


		Collections.sort(carros, new PlacaComparator());

		Assert.assertEquals("ABC-1890",carros.get(0).getPlaca());
		Assert.assertEquals("ABC-9999",carros.get(1).getPlaca());
		Assert.assertEquals("DAD-1234",carros.get(2).getPlaca());
		
		Iterator<Carro> it = carros.iterator();
		while (it.hasNext()){
			System.out.println(it.next().getMarca());
		}

		carros.forEach(p -> System.out.println(p.getNome()));
		carros.add(new Carro(2017, "GOLF", "VW", "DAD-1234"));
		carros.stream().filter(
				p -> p.getMarca().equals("VW")
					&& p.getAno() == 2017
				).forEach(
						c -> System.out.println(c.getNome()));

		//carros.stream().sorted()

	}

}
