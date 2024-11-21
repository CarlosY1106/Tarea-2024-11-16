/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentaVehiculos;

/**
 *
 * @author Carlitos Chávez.
 */
public class Motos {
    private Integer Montura;
    private Integer Retrovisores;

    public Motos(Integer Montura, Integer Retrovisores) {
        this.Montura = Montura;
        this.Retrovisores = Retrovisores;
    }

    public Integer getMontura() {
        return Montura;
    }

    public void setMontura(Integer Montura) {
        this.Montura = Montura;
    }

    public Integer getRetrovisores() {
        return Retrovisores;
    }

    public void setRetrovisores(Integer Retrovisores) {
        this.Retrovisores = Retrovisores;
    }
    
}
