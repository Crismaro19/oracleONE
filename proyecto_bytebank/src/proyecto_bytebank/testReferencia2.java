package proyecto_bytebank;

import bytebankHeredado.Cliente;
import bytebankHeredado.Cuenta;

public class testReferencia2 {
	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nombre = "Diego";
		diego.documento = "1012447538";
		diego.telefono = "3043757673";
		
		Cuenta cuentaDeDiego = new Cuenta();
		cuentaDeDiego.agencia  = 1;
		cuentaDeDiego.titular = diego;
		System.out.println(cuentaDeDiego.titular.documento);
		System.out.println(cuentaDeDiego.titular);
		System.out.println(diego);
	}

}
