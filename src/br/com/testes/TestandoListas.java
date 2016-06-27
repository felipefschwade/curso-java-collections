package br.com.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.classes.Aula;

public class TestandoListas {
	public static void main(String[] args) {
		List<Aula> aulas = new ArrayList<>();
		Aula a1 = new Aula("Revistando as ArrayLists", 21);
		Aula a2 = new Aula("Listas de objetos", 20);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);

		System.out.println(aulas);

		aulas.sort(Comparator.comparing(Aula::getTempo)); //Sitaxe: comparing(class::method)

		System.out.println(aulas);
	}
}
