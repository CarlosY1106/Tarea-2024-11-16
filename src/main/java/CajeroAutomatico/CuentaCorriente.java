/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author Carlitos Chávez.
 */
public class CuentaCorriente extends CuentaPrincipal{
    private String Nombre;
    private Integer Edad;

    public CuentaCorriente(String Nombre, Integer Edad, String NombreCuenta, Integer DNI, double Saldo) {
        super(NombreCuenta, DNI, Saldo);
        this.Nombre = Nombre;
        this.Edad = Edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer Edad) {
        this.Edad = Edad;
    }
    
}
