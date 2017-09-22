package com.algaworks.financeiro.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class CadastroTorcedorBean {
	
	private String timeFavorito;
	private String[] timesFavoritos;
	
	
	public String getTimeFavorito(){
		return this.timeFavorito;
	}
	
	public void setTimeFavorito(String timeFavorito){
		this.timeFavorito = timeFavorito;
	}

	public String[] getTimesFavoritos() {
		return timesFavoritos;
	}

	public void setTimesFavoritos(String[] timesFavoritos) {
		this.timesFavoritos = timesFavoritos;
	}
	
	

}
