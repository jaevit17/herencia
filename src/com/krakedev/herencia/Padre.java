package com.krakedev.herencia;

public class Padre {
	//ATRIBUTOS
	private int defectos;
	private int virtudes;
	private double totalAhorrado;
	
	//CONSTRUCTOR
//	public Padre() {
//		System.out.println("Soy el constructor vacio del Padre");
//	}
	public Padre(int virtudes,int defectos) {
		this.defectos=defectos;
		this.virtudes=virtudes;
	}
	
	//GETTERS-SETTERS
	public int getDefectos() {
		return defectos;
	}
	public void setDefectos(int defectos) {
		this.defectos = defectos;
	}
	public int getVirtudes() {
		return virtudes;
	}
	public void setVirtudes(int virtudes) {
		this.virtudes = virtudes;
	}
	public double getTotalAhorrado() {
		return totalAhorrado;
	}
	public void setTotalAhorrado(double totalAhorrado) {
		this.totalAhorrado = totalAhorrado;
	}
	//METODOS
	public void imprimir() {
		System.out.println("Virtudes: "+getVirtudes());
		System.out.println("Defectos: "+getDefectos());
		System.out.println("Ahorros: "+totalAhorrado);
		System.out.println("----------------------------");
		
	}
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes +
				", totalAhorrado=" + totalAhorrado + "]";
	}
	
	public void ahorrar(double monto){
		totalAhorrado += monto;
	}
	
}
