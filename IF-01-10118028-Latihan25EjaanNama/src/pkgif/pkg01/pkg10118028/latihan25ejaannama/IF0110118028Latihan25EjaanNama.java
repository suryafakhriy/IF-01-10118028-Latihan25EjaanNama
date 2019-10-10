/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg01.pkg10118028.latihan25ejaannama;
    import java.util.Scanner;
/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI : Ejaan Nama
 */
public class IF0110118028Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String nama;
        //input
        System.out.print("Masukkan nama depan anda untuk di eja: ");
        Scanner tempNama = new Scanner(System.in);
        nama = tempNama.nextLine();
        
        
        // proses
        char ejaan [] = nama.toCharArray();
        
        //output
        
        for(int i = 0; i < ejaan.length ; i++){
            System.out.println("Huruf Ke - " + (i+1) + " : " + ejaan[i]);
        }
    }
    
}
