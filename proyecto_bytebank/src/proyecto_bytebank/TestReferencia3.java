package proyecto_bytebank;

import bytebankHeredado.Cuenta;

public class TestReferencia3 {

	public static void main(String[] args) {
		Cuenta cuentaDeDiego = new Cuenta ();
		cuentaDeDiego.titular.nombre = "Diego";
		System.out.println(cuentaDeDiego.titular.nombre);

	}

}
