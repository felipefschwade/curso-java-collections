package br.com.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {
	public static void main(String[] args) {
		List<String> cursos = new ArrayList<>();
		cursos.add("Laravel");
		cursos.add("PHPUnit");
		cursos.add("Java e JDBC");
		System.out.println(cursos);

		cursos.remove(1);
		System.out.println(cursos);
		System.out.println(cursos.get(0));

		Collections.sort(cursos);
		System.out.println(cursos);
	}
}
