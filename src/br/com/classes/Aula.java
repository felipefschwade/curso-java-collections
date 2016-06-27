package br.com.classes;

public class Aula {

	private int tempo;
	private String nome;

	public Aula(String nome, int tempo) {
		super();
		this.tempo = tempo;
		this.nome = nome;
	}

	public int getTempo() {
		return tempo;
	}

	public String getNome() {
		return nome;
	}

}
