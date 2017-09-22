package com.algaworks.financeiro.model;

public class Livro {
	
	private String autor;
	private String titulo;
	
	public Livro(){}
	
	public Livro(String titulo, String autor){
		 super();
		 this.titulo = titulo;
		 this.autor = autor;
	}
	
	public String getTitulo(){
		return this.titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getAutor(){
		return this.autor;
	}
	
	public void setAutor(String autor){
		this.autor = autor;
	}

}
