/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dean
 */
public class Chara {
    protected String nama;

    public Chara(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
    
    public void displayChara(){
        System.out.println(nama);
    }
}
