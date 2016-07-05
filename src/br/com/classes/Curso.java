package br.com.classes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Curso {

	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso [nome = " + nome + ", tempo = " + getTempoTotal() + " aulas = [" + aulas + "]";
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		if (this.matriculaParaAluno.get(aluno.getMatricula()) != null) {
			throw new IllegalArgumentException("O Aluno:" + aluno + " j� est� matriculado");
		}
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(this.alunos);
	}

	public boolean estaMatriculado(Aluno a1) {
		return this.alunos.contains(a1);
	}

	public Aluno buscaMatriculado(int matricula) {
		return this.matriculaParaAluno.get(matricula);
	}

}