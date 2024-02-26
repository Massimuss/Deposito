package cuentas;

/**
 * @author Macia
 * La clase Main es la clase principal que contiene el método main para ejecutar el programa.
 * En este caso, realiza operaciones en una cuenta bancaria.
 */
public class Main {

    /**
     * El método main es el punto de entrada principal del programa.
     * Crea una cuenta, realiza operaciones y muestra el saldo resultante.
     *
     * @param args = Los argumentos de la línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        operativa_cuenta(10);
    }

    /**
     * El método operativa_cuenta realiza operaciones en una cuenta bancaria y muestra el saldo resultante.
     *
     * @param cantidad = La cantidad con la que se inicia la operativa de la cuenta.
     */
    private static void operativa_cuenta(float cantidad) {
    	
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
