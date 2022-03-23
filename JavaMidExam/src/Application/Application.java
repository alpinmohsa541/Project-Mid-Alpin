/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;
import Data.*;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        var scanner = new Scanner(System.in);
        
        String name = null, brand = null, namaProcessor = null, SO = null, storage = null;
        byte procCore = 0, RAM = 0, stok = 0;
        int  Pixel = 0;
        int refreshRate = 0;
        
                System.out.println(" Toshiba");

                System.out.println("----------------------------");
                System.out.println("    TOKO MANGGA KECIL       ");
                System.out.println("----------------------------");

                System.out.print("Name\t\t\t: ");
                name = scanner.nextLine();

                System.out.print("Brand\t\t\t: ");
                brand = scanner.nextLine();

                System.out.print("Processor\t\t: ");
                namaProcessor = scanner.nextLine();

                System.out.print("Sistem Operasi\t\t: ");
                SO = scanner.nextLine();

                System.out.print("Storage\t\t\t: ");
                storage = scanner.nextLine();

                System.out.print("Core Proccesor\t\t: ");
                procCore = scanner.nextByte();

                System.out.print("RAM\t\t\t: ");
                RAM = scanner.nextByte();

                System.out.print("Stok\t\t\t: ");
                stok = scanner.nextByte();

                System.out.print("Screen Rate\t\t: ");
                refreshRate = scanner.nextInt();

                System.out.print("Pixel Camera\t\t: ");
                Pixel = scanner.nextInt();


                var cek = new Toshiba(name, brand, namaProcessor, SO, storage, procCore, RAM, stok, refreshRate, Pixel);

                System.out.println("=======================");
                System.out.println("Nama Pembeli\t\t\t: " + cek.getName());
                System.out.println("Brand Laptop\t\t\t: "+ cek.getBrand());
                System.out.println("Nama Proccesor Laptop\t\t: "+ cek.getNamaProcessor());
                System.out.print("Core Proccesor\t\t\t: "); cek.setProcCore(procCore);
                System.out.println("Sistem Operasi Laptop\t\t: " + cek.getSO());
                System.out.print("Ukuran RAM Laptop\t\t: "); cek.setRAM(RAM);
                System.out.println("Jenis Storage Laptop\t\t: " + cek.getStorage());
                System.out.print("Storfront Position\t\t: "); cek.setStorfronePosition(storage);
                System.out.print("Berat Laptop\t\t\t: "); cek.setPixel(Pixel);
                System.out.print("Refresh Rate Layar Laptop\t: "); cek.setRefreshRate(refreshRate);
                System.out.print("Stok yang ada\t\t\t: "); cek.setStok(stok);
            
                
                System.out.println(" Realme");
                
                System.out.println("----------------------------");
                System.out.println("    TOKO MANGGA KECIL       ");
                System.out.println("----------------------------");

                System.out.print("Name\t\t\t: ");
                name = scanner.nextLine();

                System.out.print("Brand\t\t\t: ");
                brand = scanner.nextLine();

                System.out.print("Processor\t\t: ");
                namaProcessor = scanner.nextLine();

                System.out.print("Sistem Operasi\t\t: ");
                SO = scanner.nextLine();

                System.out.print("Storage\t\t\t: ");
                storage = scanner.nextLine();

                System.out.print("Core Proccesor\t\t: ");
                procCore = scanner.nextByte();

                System.out.print("RAM\t\t\t: ");
                RAM = scanner.nextByte();

                System.out.print("Stok\t\t\t: ");
                stok = scanner.nextByte();

                System.out.print("Screen\t\t: ");
                refreshRate = scanner.nextInt();

                System.out.print("Pixel Camera\t\t: ");
                Pixel = scanner.nextInt();


                var cek1 = new Toshiba(name, brand, namaProcessor, SO, storage, procCore, RAM, stok, refreshRate, Pixel);

                System.out.println("=======================");
                System.out.println("Nama Pembeli\t\t\t: " + cek1.getName());
                System.out.println("Brand Laptop\t\t\t: "+ cek1.getBrand());
                System.out.println("Nama Proccesor Laptop\t\t: "+ cek1.getNamaProcessor());
                System.out.print("Core Proccesor\t\t\t: "); cek1.setProcCore(procCore);
                System.out.println("Sistem Operasi Laptop\t\t: " + cek1.getSO());
                System.out.print("Ukuran RAM Laptop\t\t: "); cek1.setRAM(RAM);
                System.out.println("Jenis Storage Laptop\t\t: " + cek1.getStorage());
                System.out.print("Storfront Position\t\t: "); cek1.setStorfronePosition(storage);
                System.out.print("Berat Laptop\t\t\t: "); cek1.setPixel(Pixel);
                System.out.print("Refresh Rate Layar Laptop\t: "); cek1.setRefreshRate(refreshRate);
                System.out.print("Stok yang ada\t\t\t: "); cek1.setStok(stok);
                


    }
}
