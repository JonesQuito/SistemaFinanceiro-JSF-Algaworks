package com.algaworks.financeiro.bean;

import java.util.Calendar;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class GeraCodigoBean {
	
	private static Integer sequencial = 0;
	private String codigo;
	private Integer mes;
	private Integer ano;
	
	public void gerar(){
		Calendar data = Calendar.getInstance();
		this.ano = data.get(Calendar.YEAR);
		this.mes = data.get(Calendar.MONTH) + 1;
		
		codigo = ano.toString() + 
				(mes < 10 ? "0" + mes.toString() : mes.toString()) + 
				(sequencial < 10 ? "00" + sequencial.toString() : sequencial < 100 ?  "0" + sequencial.toString() : sequencial.toString());
		sequencial++;		
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	

}
