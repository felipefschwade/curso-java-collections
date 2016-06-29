package br.com.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.classes.Aula;
import br.com.classes.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso curso = new Curso("Java Collections", "Instrutor");

		System.out.println(curso.getAulas());

		curso.adiciona(new Aula("Criando uma Aula", 21));
		curso.adiciona(new Aula("Trabalhando com ArrayList", 19));
		curso.adiciona(new Aula("Modelando Colecoes", 10));

		List<Aula> aulasImutaveis = curso.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);

		System.out.println(aulas);

		Collections.sort(aulas);

		System.out.println(aulas);
	}

}
