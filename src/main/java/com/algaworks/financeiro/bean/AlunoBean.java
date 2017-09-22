package com.algaworks.financeiro.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlOutputFormat;
import javax.faces.component.html.HtmlOutputLabel;

@ManagedBean
@ViewScoped
public class AlunoBean {
	
	private String nomeUsuario = "Jones Quito";
	private int qtdeTarefasPendentes = 3;
	private String curso;
	
	HtmlOutputFormat outnome;
	HtmlOutputFormat outcurso;
	HtmlOutputFormat outtarefas;
	
	
	//Criar o método para ocultar os elementos quando seus valores for null
	
	
	public HtmlOutputFormat getOutnome() {
		return outnome;
	}
	public void setOutnome(HtmlOutputFormat outnome) {
		this.outnome = outnome;
	}
	public HtmlOutputFormat getOutcurso() {
		return outcurso;
	}
	public void setOutcurso(HtmlOutputFormat outcurso) {
		this.outcurso = outcurso;
	}
	public HtmlOutputFormat getOuttarefas() {
		return outtarefas;
	}
	public void setOuttarefas(HtmlOutputFormat outtarefas) {
		this.outtarefas = outtarefas;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public int getQtdeTarefasPendentes() {
		return qtdeTarefasPendentes;
	}
	public void setQtdeTarefasPendentes(int qtdeTarefasPendentes) {
		this.qtdeTarefasPendentes = qtdeTarefasPendentes;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	

}
