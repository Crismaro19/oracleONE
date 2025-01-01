package com.bytebankHeredado.modelo;

public abstract class Cuenta {
	protected double saldo;
	private int agencia =1;
	private int numero;
	private  Cliente titular = new Cliente () ;
	 
	 private static int total;
	 
	 public Cuenta() {
		 
	 }
	 public Cuenta (int agencia, int numero) {
		
		 this.agencia = agencia; 
		 this.numero = numero;
	 	System.out.println("Estoy creando una cuenta" + this.numero);

		Cuenta.total++;  
		 
	 }
	
	//no retorna valor
	 public abstract void depositar(double valor);{
		
	}
	 public boolean saca(double valor) {
		 if( this.saldo >= valor){
			 this.saldo -=  valor;
			 return true;
			 }else {
			 return false;
		 }  
	}
	 
	public boolean transferir(double valor, Cuenta destino){
	 if(this.saldo >= valor) {
		 this.saca(valor);
		 destino.depositar(valor);
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
   		 return Cuenta.total;
   	 }
  }
