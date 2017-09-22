package com.algaworks.financeiro.bean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.html.HtmlCommandButton;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean {
	
	private String nome;
	private String endereco;
	private String email;
	private boolean termoAceite = false;
	private String mensagem;
	private char sexo;
	private ArrayList<String> assuntosInteresse = new ArrayList<>();
	
	HtmlCommandButton botao = new HtmlCommandButton();
	
	public boolean getTermoAceite(){
		return this.termoAceite;
	}
	
	public void setTermoAceite(boolean termoAceite){
		this.termoAceite = termoAceite;
	}
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public HtmlCommandButton getBotao() {
		return botao;
	}

	public void setBotao(HtmlCommandButton botao) {
		this.botao = botao;
	}
	
	public ArrayList<String> getAssuntosInteresse() {
		return assuntosInteresse;
	}

	public void setAssuntosInteresse(ArrayList<String> assuntosInteresse) {
		this.assuntosInteresse = assuntosInteresse;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void exibeMensagem(){
		if (termoAceite) {
			this.mensagem = "Você concordou com os termos e condições";
		}else{
			this.mensagem = "";
		}
	}
	
	public void resetar(){
		this.nome = "";
		this.email = "";
		this.endereco = "";
	}

}
