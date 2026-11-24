package com.krakedev.herencia.test;

import java.util.ArrayList;

import com.krakedev.herencia.Hija;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Hija> listaDeHijas= new ArrayList<Hija>();
		
		Hija hija1=new Hija(3,5);
		hija1.setDefectos(2);
		hija1.setVirtudes(4);
		listaDeHijas.add(hija1);
		
		Hija hija2=new Hija(5,5);
		hija2.setDefectos(3);
		hija2.setVirtudes(5);
		listaDeHijas.add(hija2);
		
		Hija hija3=new Hija(5,3);
		hija3.setDefectos(3);
		hija3.setVirtudes(5);
		listaDeHijas.add(hija3);
		
		System.out.println(listaDeHijas);
	}

}
