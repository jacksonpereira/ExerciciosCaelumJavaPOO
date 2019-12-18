package capitulo4;

import java.time.LocalDate;

public class Data {
	
	public Data(){
		LocalDate dataAtual = LocalDate.now();
		this.dia = dataAtual.getDayOfMonth();
		this.mes = dataAtual.getMonthValue();
		this.ano = dataAtual.getYear();
	}
	
	//	Properties
	private int dia;
	private int mes;
	private int ano;
	
//	Getters and setters
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
//	Methods
	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
	public String formatada() {
		return this.dia+"/"+this.mes+"/"+this.ano;
	}
}
