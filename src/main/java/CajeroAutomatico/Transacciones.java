/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CajeroAutomatico;

/**
 *
 * @author Carlitos Chávez.
 */
public class Transacciones {
    private String Destinatario;
    private Integer Monto;

    public Transacciones(String Destinatario, Integer Monto) {
        this.Destinatario = Destinatario;
        this.Monto = Monto;
    }

    public String getDestinatario() {
        return Destinatario;
    }

    public void setDestinatario(String Destinatario) {
        this.Destinatario = Destinatario;
    }

    public Integer getMonto() {
        return Monto;
    }

    public void setMonto(Integer Monto) {
        this.Monto = Monto;
    } 
}
