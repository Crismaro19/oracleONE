package java_primeros_pasos;

public class TestDescuento {

	public static void main(String[] args) {
		
		double valorCompra = 250.0;
			if (valorCompra <= 199.99 && valorCompra > 100.0)	{
				System.out.println("Su descuento es del 10 %");	
			}
			
			else if (valorCompra >= 200.0 && valorCompra < 299.99) {
				
				System.out.println("Usted tiene descuento del 15%");
			}
			else if(valorCompra > 300) {
				System.out.println("Usted tiene descuento del 20%");
			}
			else {
				System.out.println("Usted no tiene descuentos disponibles");
			}
			
			
			
		
	}

}
