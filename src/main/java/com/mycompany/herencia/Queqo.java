/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herencia;

/**
 *
 * @author carli
 */
public class Queqo extends Animal {

    public Queqo(String Pelo, String Boca, String Cola, String Ojo, Integer Pata) {
        super(Pelo, Boca, Cola, Ojo, Pata);
    }
    
    @Override
    public void Sonido (){
        System.out.println("El queqo hace ruido.");
    }
}
