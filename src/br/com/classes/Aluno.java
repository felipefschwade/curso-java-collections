package br.com.classes;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int matricula) {
		if (nome == null || matricula == 0) {
			throw new NullPointerException("O Aluno deve possuir um nome e numero de matricula válido");
		}
		this.nome = nome;
		this.numeroMatricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return numeroMatricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}

	@Override
	public boolean equals(Object outroAluno) {
		if (this == outroAluno)
			return true;
		if (outroAluno == null)
			return false;
		if (getClass() != outroAluno.getClass())
			return false;
		Aluno other = (Aluno) outroAluno;
		if (numeroMatricula != other.numeroMatricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
