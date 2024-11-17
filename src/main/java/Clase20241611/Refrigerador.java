/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clase20241611;

/**
 *
 * @author Carlitos Chávez.
 */
public class Refrigerador {
    private Integer Puertas;
    private Integer Tamaño;

    public Refrigerador(Integer Puertas, Integer Tamaño) {
        this.Puertas = Puertas;
        this.Tamaño = Tamaño;
    }

    public Integer getPuertas() {
        return Puertas;
    }

    public void setPuertas(Integer Puertas) {
        this.Puertas = Puertas;
    }

    public Integer getTamaño() {
        return Tamaño;
    }

    public void setTamaño(Integer Tamaño) {
        this.Tamaño = Tamaño;
    }
      
}
