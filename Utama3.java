/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;

/**
 *
 * @author USER
 */
public class Utama3 {

    public static void main(String[] args) {
        Orang pel = new Pelajar();
        pel.nama();
        pel.biodata();
        pel.biodata("Perumahan Graha Tirta 2, Bandung");
        System.out.println(" ");

        Orang peg = new Pegawai();
        peg.nama();
        peg.biodata();
        peg.biodata("Jln. Kenanga No. 15, Tangerang");
    }

}
