/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class Main {

    public static void main(String[] args) {
        CCuenta objetoCuenta;
        double saldoActual;
        

        objetoCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = objetoCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );
        
    
    }
    

    
    public static void probarIngresar(CCuenta c, int cantidad, int CantidadEsperada) throws Exception{
        try {
			c.ingresar(cantidad, new Exception("No se puede ingresar una cantidad negativa"));
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
        
    }
    
    public static void probarRetirar(CCuenta c, int cantidad, int CantidadEsperada) throws Exception{
    	double cantidadEsperada;
        try {
			c.retirar(cantidad);
		} catch (Exception e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
		}
    }
}