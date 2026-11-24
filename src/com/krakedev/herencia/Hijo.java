package com.krakedev.herencia;

public class Hijo extends Padre{
	private int juguetes;
	//CONSTRUCTOR
	public Hijo(int virtudes,int defectos,int juguetes) {
		this.juguetes=juguetes;
		super(virtudes,defectos);
	}
	//METODOS
	@Override
	public String toString() {
		return "Hijo [juguetes: " + juguetes + " virtudes: " + getVirtudes() + " defectos: " + getDefectos() +"]";
	}
	
}
