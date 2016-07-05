package br.com.testes;

import java.util.Collection;

import br.com.classes.Aluno;
import br.com.classes.Aula;
import br.com.classes.Curso;

public class TestaCursoComAlunos {

	public static void main(String[] args) {

		Curso curso = new Curso("Java Collections", "Instrutor");

		curso.adiciona(new Aula("Criando uma Aula", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 19));
		curso.adiciona(new Aula("Modelando Colecoes", 10));

		System.out.println(curso.getAulas());

		Aluno a1 = new Aluno("Paulo", 123123);
		curso.matricula(a1);
		curso.matricula(new Aluno("Alberto", 321321));
		curso.matricula(new Aluno("Pedro", 121233));
		curso.matricula(new Aluno("Nico", 1234324));

		Aluno a2 = new Aluno("Paulo", 123123);

		Collection<Aluno> alunos = curso.getAlunos();

		System.out.println(alunos);

		System.out.println(curso.estaMatriculado(a1));
		System.out.println(curso.estaMatriculado(a2));

		System.out.println(curso.buscaMatriculado(321321));
	}

}
