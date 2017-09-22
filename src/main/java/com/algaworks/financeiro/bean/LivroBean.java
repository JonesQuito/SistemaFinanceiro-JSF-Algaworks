package com.algaworks.financeiro.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.algaworks.financeiro.model.Livro;

@ManagedBean
public class LivroBean {
	
	private List<Livro> livros;
	
	public LivroBean(){
		this.livros = new ArrayList<>();
		this.livros.add(new Livro("Java e Orientação a Objetos", "Thiago Faria"));
		this.livros.add(new Livro("JPA e Hibernate", "Thiago Faria"));
		this.livros.add(new Livro("JavaServer Faces", "Thiago Faria"));
		this.livros.add(new Livro("Test Driven Development", "Kent Beck"));
		this.livros.add(new Livro("Start Small, Stay Small", "Rob Walling"));
		this.livros.add(new Livro("Trabalhe 4 Horas Por Semana", "Timothy Ferris"));
		this.livros.add(new Livro("Getting Real", "Jason Fried"));
		this.livros.add(new Livro("Rework", "Jason Fried"));
	}
	
	public List<Livro> getLivros(){
		return this.livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
}
