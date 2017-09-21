package br.com.db1.colecoes;

public class Produto implements Comparable<Produto> {

	private Integer id;
	private String descricao;
	private Double valor;

	public Produto(Integer id, String descricao, Double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Override
	public int compareTo(Produto outroProduto) {
		if (this.getValor() < outroProduto.getValor()) {
			return -1;
		}
		if (this.getValor() > outroProduto.getValor()) {
			return 1;
		}
		return 0;
	}

}
