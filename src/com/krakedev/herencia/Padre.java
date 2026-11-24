package com.krakedev.herencia;

public class Padre {
	private int defectos;
	private int virtudes;
	
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
	//METODOS
	public void imprimir() {
		System.out.println("Virtudes: "+getVirtudes());
		System.out.println("Defectos: "+getDefectos());
	}
	public void guardarSecreto() {
		System.out.println("Esto no se hereda");
	}
	
	@Override
	public String toString() {
		return "Padre [defectos=" + defectos + ", virtudes=" + virtudes + "]";
	}
	
}
