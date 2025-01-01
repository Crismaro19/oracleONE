package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Gerente;

public class testGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setTipo(1);
		gerente.setSalario(6000);
		gerente.setClave("AluraCursosOnline");
		
		//a esto se le llama sobreescritura de método
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("AluraCursosOnline"));
		
	}

}
