package com.krakedev.herencia.test;

import com.krakedev.herencia.Hija;
import com.krakedev.herencia.Hijo;
import com.krakedev.herencia.Padre;

public class TestAhorros {

	public static void main(String[] args) {
		Padre p=new Padre("Franklin",3,4);
		p.ahorrar(300);
		p.imprimir();
		Hija h=new Hija("Maria",4,1);
		h.ahorrar(300);
		h.ahorrar(20);
		h.imprimir();
		Hijo hi=new Hijo("Luis",1,1,1);
		hi.ahorrar(400);
		hi.ahorrar(300);
		hi.imprimir();

	}

}
