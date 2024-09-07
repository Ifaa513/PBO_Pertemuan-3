/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

/**
 *
 * @author USER
 */
public abstract class Orang {

    public abstract void nama();

    public void biodata() {
        System.out.println("Saya berusia 22 tahun");
    }

    public void biodata(String alamat) {
        System.out.println("Saya berasal dari " + alamat);

    }
}
