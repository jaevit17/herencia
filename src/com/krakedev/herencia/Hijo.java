package com.krakedev.herencia;

public class Hijo extends Padre{
	private int juguetes;
	//CONSTRUCTOR
	public Hijo(String nombre,int virtudes,int defectos,int juguetes) {
		this.juguetes=juguetes;
		super(nombre,virtudes,defectos);
	}
	//METODOS
	@Override
	public String toString() {
		return "Hijo [juguetes: " + juguetes + " virtudes: " + getVirtudes() + 
				" defectos: " + getDefectos()+"]";
	}
	
	public void ahorrar(double monto) {
		setTotalAhorrado(getTotalAhorrado()+(monto/2));
	}
	
}
