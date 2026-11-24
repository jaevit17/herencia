package com.krakedev.herencia;

public class Hija extends Padre {
	//METODOS
	public void escucharAlexCampos(){
		System.out.println("Escuchando esta musica increible");
	}

	@Override
	public String toString() {
		return "Defectos: "+getDefectos()+" Virtudes: "+getVirtudes();
	}
	
	public Hija(String nombre,int virtudes,int defectos) {
		super(nombre,virtudes,defectos);
	}
	
}
