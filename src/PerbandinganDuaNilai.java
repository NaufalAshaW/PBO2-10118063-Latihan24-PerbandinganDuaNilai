/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class PerbandinganDuaNilai {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner(System.in);
          
          System.out.println("=======Program Perbandingan Nilai=======");
          
          boolean enough = false;
          
          while(!enough){
              System.out.print("Masukkan Nilai Pertama : ");
              int nilai1 = scanner.nextInt();
              System.out.print("Masukkan Nilai Kedua : ");
              int nilai2 = scanner.nextInt(); 
              
              if(nilai1 > nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih besar dari " + nilai2);
            } else if(nilai1 < nilai2) {
                System.out.println("Hasil: " + nilai1 + " lebih kecil dari " + nilai2);
            } else {
                System.out.println("Hasil: " + nilai1 + " sama dengan " + nilai2);
            }
             System.out.print("Ulangi aktifitas? (Ya/Tidak) : ");
            
            if(!scanner.next().equals("Ya")) {
                enough = true;
            }
         }
      
    }
}
