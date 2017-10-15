package com.algaworks.financeiro.bean;

import java.util.Calendar;
import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CalculadoraDataBean {

	private Date dataBase;
	private Integer dias;
	private Date resultado;

	public void adicionar() {
		Calendar dataCalculo = Calendar.getInstance();
		dataCalculo.setTime(this.dataBase);
		dataCalculo.add(Calendar.DAY_OF_MONTH, dias);
		this.resultado = dataCalculo.getTime();
		validaResultado(resultado);
	}
	

	public void validaResultado(Date resultado) {
		Calendar calendario = Calendar.getInstance();
		calendario.setTime(resultado);

		int diaSemana = calendario.get(Calendar.DAY_OF_WEEK);
		if (diaSemana < Calendar.MONDAY || diaSemana > Calendar.FRIDAY) {
			setResultado(null);
			dias = 0;
			FacesMessage faces = new FacesMessage(FacesMessage.SEVERITY_ERROR,
					"Dia inválida", "O resultado não é um dia útil");
			FacesContext context = FacesContext.getCurrentInstance();
			context.addMessage(null, faces);
		}

	}

	public Date getDataBase() {
		return dataBase;
	}

	public void setDataBase(Date dataBase) {
		this.dataBase = dataBase;
	}

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Date getResultado() {
		return resultado;
	}

	public void setResultado(Date resultado) {
		this.resultado = resultado;
	}

}
