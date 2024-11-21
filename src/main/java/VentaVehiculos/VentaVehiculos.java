/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author Carlitos Chávez.
 */
public class VentaVehiculos {
    private String Motor;
    private String Color;
    private Integer Llantas;

    public VentaVehiculos(String Motor, String Color, Integer Llantas) {
        this.Motor = Motor;
        this.Color = Color;
        this.Llantas = Llantas;
    }

    public String getMotor() {
        return Motor;
    }

    public void setMotor(String Motor) {
        this.Motor = Motor;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public Integer getLlantas() {
        return Llantas;
    }

    public void setLlantas(Integer Llantas) {
        this.Llantas = Llantas;
    }
    
}
