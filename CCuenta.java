/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidadFinanciera;


public class CCuenta {

    /**
     * Nombre de la persona titular
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    public double estado(){
        return this.getSaldo();
    }

    public void ingresar(double cantidad, Exception ERRORCANTIDADNEGATIVA) throws Exception
    {
        if (cantidad<0)
            throw ERRORCANTIDADNEGATIVA;
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * @return el nombre
	 */
	private String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre el nombre a establecer
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return el cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * @param cuenta el cuenta a establecer
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * @return el saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo el saldo a establecer
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return el tipoInterés
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * @param tipoInterés el tipoInterés a establecer
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}



    
   