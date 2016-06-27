package br.com.classes;

public class Aula implements Comparable<Aula> {

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

	@Override
	public String toString() {
		return "Aula [nome=" + this.nome + ", tempo=" + this.tempo + "]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outraAula.getNome());
	}

}
