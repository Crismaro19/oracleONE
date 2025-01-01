package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Contador;
import com.bytebankHeredado.modelo.Funcionario;

public class testFuncionario {

	public static void main(String[] args) {
		
		Funcionario diego = new Contador();
		diego.setNombre("Diego");
		diego.setDocumento("1012446767");
		diego.setSalario(2000);
		
		System.out.println(diego.getSalario());
		System.out.println(diego.getBonificacion());
		
	}

}
