package ru.vaszol.model;

public class Group {
	//private int number;
	private String name;
	private String pfoto;
	private String psig;
	
	public Group(/*int number,*/ String name, String pfoto, String psig){
		this.name = name;
		this.pfoto = pfoto;
		this.psig = psig;
		//this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getpfoto() {
		return pfoto;
	}
	public void setpfoto(String pfoto) {
		this.pfoto = pfoto;
	}
	public String getPathSign() {
		return psig;
	}
	public void setpsig(String psig) {
		this.psig = psig;
	}
	
	
	
	
}