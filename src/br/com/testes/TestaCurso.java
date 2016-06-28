package br.com.testes;

import br.com.classes.Curso;

public class TestaCurso {

	public static void main(String[] args) {

		Curso curso = new Curso("Java Collections", "Instrutor");

		System.out.println(curso.getAulas());

	}

}
