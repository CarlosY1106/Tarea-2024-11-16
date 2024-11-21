/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author Carlitos Chávez.
 */
public class CuentaDeAhorros {
    private double Intereses;
    private String Cuenta;

    public CuentaDeAhorros(double Intereses, String Cuenta) {
        this.Intereses = Intereses;
        this.Cuenta = Cuenta;
    }

    public double getIntereses() {
        return Intereses;
    }

    public void setIntereses(double Intereses) {
        this.Intereses = Intereses;
    }

    public String getCuenta() {
        return Cuenta;
    }

    public void setCuenta(String Cuenta) {
        this.Cuenta = Cuenta;
    }
    
}
