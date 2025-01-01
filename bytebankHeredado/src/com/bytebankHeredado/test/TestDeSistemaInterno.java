package com.bytebankHeredado.test;

import com.bytebankHeredado.modelo.Administrador;
import com.bytebankHeredado.modelo.Gerente;
import com.bytebankHeredado.modelo.SistemaInterno;

public class TestDeSistemaInterno {
	/** aver que documentación que me crea }
	 * skdjfhskjdf
	 * 
	 * @author Natalia
	 *  
	 */

	public static void main(String[] args) {
		SistemaInterno sistema = new SistemaInterno();
		Gerente gerente1 = new Gerente();
		Administrador admin = new Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
		

	}

}
 