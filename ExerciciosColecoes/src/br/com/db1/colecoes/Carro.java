package br.com.db1.colecoes;

public class Carro implements Comparable<Carro> {

	private String nome;
	private Integer ano;
	private String placa;
	private String marca;

	public Carro(Integer anoCarro, String nomeCarro, String marcaCarro, String placaCarro) {
		this.ano = anoCarro;
		this.nome = nomeCarro;
		this.marca = marcaCarro;
		this.placa = placaCarro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public int compareTo(Carro outroCarro) {
		if (this.getAno() < outroCarro.getAno()){
			return -1;
		}

		if (this.getAno() > outroCarro.getAno()){
			return 1;
		}
		return 0;
	}

}

