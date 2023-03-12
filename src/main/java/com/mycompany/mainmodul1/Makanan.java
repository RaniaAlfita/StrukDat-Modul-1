/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainmodul1;

/**
 *
 * @author USER
 */
public class Makanan extends Hidangan{
    @Override
    public String disantap(){
        return this.getNamaHidangan() + " dimakan";
    }

    void setnamaHidangan(String nasi_Putih) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}