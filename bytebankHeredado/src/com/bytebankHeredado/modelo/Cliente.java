package com.bytebankHeredado.modelo;

public class Cliente implements Autenticable {
	private String documento;
	private String telefono;
	private String nombre;
	
	
	private AutenticacionUtil util;
	
	public Cliente() {
	this.util = new AutenticacionUtil();
		
	}
	
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.iniciarSesion(clave);	
		
	}
	@Override
	public void setClave(String clave) {
		this.setClave(clave);
		
	}
	
	
	
}
