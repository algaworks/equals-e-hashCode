package com.algaworks;

import java.util.HashSet;
import java.util.Set;

import com.algaworks.modelo.Aluno;

public class Teste {

	public static void main(String[] args) {
		Set<Aluno> alunos = recuperarAlunos();
		
		Aluno pesquisa = new Aluno(2L);
		
		boolean existeEsteAluno = alunos.contains(pesquisa);
		System.out.println("Existe aluno? " + existeEsteAluno);
	}
	
	public static Set<Aluno> recuperarAlunos() {
		Aluno joao = new Aluno(1L, "João");
		Aluno maria = new Aluno(2L, "Maria");
		Aluno davi = new Aluno(3L, "Davi");
		
		Set<Aluno> alunos = new HashSet<Aluno>();
		alunos.add(joao);
		alunos.add(maria);
		alunos.add(davi);
		
		return alunos;
	}
	
}
