package br.com.classes;

public class Aluno {

	private String nome;
	private int matricula;

	public Aluno(String nome, int matricula) {
		super();
		this.nome = nome;
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "[Aluno: " + this.nome + ", matricula: " + this.matricula + "]";
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
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
