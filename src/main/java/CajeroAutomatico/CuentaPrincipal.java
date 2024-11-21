/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author Carlitos Chávez.
 */
public class CuentaPrincipal {
    private String NombreCuenta;
    private Integer DNI;
    private double Saldo;

    public CuentaPrincipal(String NombreCuenta, Integer DNI, double Saldo) {
        this.NombreCuenta = NombreCuenta;
        this.DNI = DNI;
        this.Saldo = Saldo;
    }

    public String getNombreCuenta() {
        return NombreCuenta;
    }

    public void setNombreCuenta(String NombreCuenta) {
        this.NombreCuenta = NombreCuenta;
    }

    public Integer getDNI() {
        return DNI;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    
    
}
