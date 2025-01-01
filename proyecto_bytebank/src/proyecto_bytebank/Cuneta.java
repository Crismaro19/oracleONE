package proyecto_bytebank;

import bytebankHeredado.Cliente;

class Cuneta {
	private double saldo;
	private int agencia;
	private int numero;
	 private  Cliente titular = new Cliente () ;
	 
	 private static int total = 0;
	 public Cuneta (int agencia ) {
		
		 if(agencia <= 0) {
			 
			 System.out.println("no se permite 0 ");
			 this.agencia = 1;
		 }else {
			 this.agencia = agencia;
		 }
		total++;  
		 
		 System.out.println("se van creando: " + total + " cuentas");
	 }
	
	
	
	
	//no retorna valor
	 public void depositar(double saldo){
		 this.saldo = this.saldo + saldo;
	}
	 public boolean retirar(double valor) {
		 if( this.saldo >= valor){
			 this.saldo -=  valor;
			 return true;
			 }
		 else {
			 return false;
		 }  
	}
	 
	public boolean transferir(double valor, Cuneta cuenta){
	 if(this.saldo >= valor) {
		 this.saldo -= valor;
		 cuenta.depositar(valor);
		 return true;	 
	 } 
		 return false;
	}
  
  	public double getSaldo(){
  		return this.saldo;
  		}
   
   	 public int getAgencia() {
		return agencia;
	}
   	 public void setTitular(Cliente titular) {
		this.titular = titular;
	}
   	 public Cliente getTitular() {
		return titular;
	}
   	 public static int getTotal() {
   		 return Cuneta.total;
   	 }
  }
