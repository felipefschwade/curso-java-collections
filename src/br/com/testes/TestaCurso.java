package br.com.testes;

import br.com.classes.Aula;
import br.com.classes.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Java Collections", "Instrutor");

		System.out.println(curso.getAulas());

		curso.adiciona(new Aula("Aula 1", 21));
		curso.adiciona(new Aula("Aula 2", 19));
		curso.adiciona(new Aula("Aula 3", 10));
		curso.adiciona(new Aula("Aula 4", 23));

		System.out.println(curso.getAulas());
	}

}
