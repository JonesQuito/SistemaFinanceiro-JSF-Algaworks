package com.algaworks.financeiro.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.algaworks.financeiro.model.Livro;

@ManagedBean
@ViewScoped
public class LivroBean2 {
	private List<Livro> livros;
	private Livro novoLivro;
	
	public LivroBean2(){
		this.livros = new ArrayList<>();
		this.novoLivro = new Livro();
	}
	
	public void adicionar(){
		this.livros.add(novoLivro);
		this.novoLivro = new Livro();
	}
	
	public Livro getNovoLivro(){
		return this.novoLivro;
	}
	
	public List<Livro> getLivros(){
		return this.livros;
	}
	
	public void setLivros(List<Livro> livros){
		this.livros = livros;
	}

}
