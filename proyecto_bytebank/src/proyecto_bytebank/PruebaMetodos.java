package proyecto_bytebank;

import bytebankHeredado.Cuenta;

public class PruebaMetodos {
	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta ();
		miCuenta.saldo = 300;
		miCuenta.depositar(200);
		System.out.println("el monto en su cuenta es de " + miCuenta.getSaldo());
		
		miCuenta.retirar(100);
		System.out.println("el monto en su cuenta es de " + miCuenta.getSaldo());
		
		Cuenta cuentaDos = new Cuenta ();
		cuentaDos.depositar (1000);
		cuentaDos.transferir(400, miCuenta);
		System.out.println("su valor actual en la cuenta es " + cuentaDos.getSaldo() );
		System.out.println("su valor actual en la cuenta es " + miCuenta.getSaldo() );
	}
	

}
