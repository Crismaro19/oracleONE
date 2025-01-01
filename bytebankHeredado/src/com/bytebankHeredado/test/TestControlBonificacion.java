package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Contador;
import com.bytebankHeredado.modelo.Funcionario;
import com.bytebankHeredado.modelo.Gerente;
import com.bytebankHeredado.modelo.controlBonificacion;

public class TestControlBonificacion {

	public static void main(String[] args) {
		Funcionario diego = new Contador();
		diego.setSalario(2000);
		
		Gerente jimena = new Gerente();
		jimena.setSalario(10000);
		
		Contador alexis = new Contador();
		alexis.setSalario(5000);
		
		controlBonificacion controlBonificacion = new controlBonificacion();
		
		controlBonificacion.registrarSalario(diego);
		controlBonificacion.registrarSalario(jimena);
		controlBonificacion.registrarSalario(alexis);
		

	}

}
