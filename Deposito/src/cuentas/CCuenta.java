package cuentas;

/**
 * @author Macia
 * La clase CCuenta representa una cuenta bancaria de una persona.
 * Esta clase permite gestionar el nombre del titular, el número de cuenta, el saldo y el tipo de interés.
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * Constructor con parámetros de la clase CCuenta:
     *
     * @param nom =  Nombre del titular de la cuenta
     * @param cue =  Número de cuenta
     * @param sal  = Saldo inicial de la cuenta
     * @param tipo = Tipo de interés de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo;
    }

    /**
     * Aquí se obtiene el nombre del titular de la cuenta
     *
     * @return El nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Se establece el nombre del titular de la cuenta
     *
     * @param nombre = El nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Se obtiene el número de cuenta
     *
     * @return El número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Se establece el número de cuenta
     *
     * @param cuenta = El número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta
     *
     * @return El saldo actual de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     *
     * @param saldo = El saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés de la cuenta
     *
     * @return El tipo de interés de la cuenta
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta
     *
     * @param tipoInterés = El tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Se obtiene el estado actual de la cuenta
     *
     * @return El saldo actual de la cuenta
     */
    public double estado() {
        return saldo;
    }

    /**
     * Permite ingresar una cantidad en la cuenta
     *
     * @param cantidad = La cantidad a ingresar en la cuenta
     * @throws Exception = Si la cantidad a ingresar es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de la cuenta
     *
     * @param cantidad = La cantidad a retirar de la cuenta.
     * @throws Exception = Si la cantidad a retirar es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
