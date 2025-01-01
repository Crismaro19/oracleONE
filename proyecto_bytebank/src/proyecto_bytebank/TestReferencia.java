package proyecto_bytebank;

import bytebankHeredado.Cuenta;

public class TestReferencia {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(); 
		primeraCuenta.saldo = 200;
		
		Cuenta segundaCuenta = primeraCuenta ;
		Cuenta terceraCuenta =  segundaCuenta ; 
		segundaCuenta.saldo = 100;
		System.out.println("saldo primera cuenta " + primeraCuenta.saldo);
		System.out.println("saldo segunda cuenta " + segundaCuenta.saldo);
		segundaCuenta.saldo += 400;
		
		
		
		System.out.println(primeraCuenta);
		System.out.println(segundaCuenta);
	
		
		
	
	}
}
