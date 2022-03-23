/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ifharga {
    int nilai;
    public void harga(){
        
      var scanner = new Scanner(System.in);
      
      System.out.print("masukan harga\t\t\tRp : ");
      int nilai = scanner.nextInt();
      System.out.println("harga\t\t\t: Rp "+nilai);
        if(nilai>=0){
        } else  {
            System.out.println("Harus Angka Positif");
        }
        
        
    }
}
