package br.com.testes;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();

		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");
		alunos.add("Nico");

		alunos.forEach(aluno -> System.out.println(aluno));
		System.out.println("Segunda impressão: ");
		alunos.add("Paulo");
		alunos.add("Guilherme");
		alunos.add("Cesar");
		alunos.add("Nico");

		alunos.forEach(aluno -> System.out.println(aluno));
	}

}
