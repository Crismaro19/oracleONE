package proyecto_bytebank;

import bytebankHeredado.Cuenta;

public class PruebaAcceso {
	
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(400);
		cuenta.setAgencia(-22);
		
		cuenta.retirar(300);
		 System.out.println(cuenta.getSaldo());
		 System.out.println(cuenta.getAgencia());
		
	}

}
