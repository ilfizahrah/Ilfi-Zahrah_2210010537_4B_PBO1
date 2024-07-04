package UasAkhir;

import java.util.Scanner;


public class kerudungBeraksi {
    public static void main(String[] args){
        //objek
        //kerudung kerudungbs = new kerudung("bella squer","A406");
        
        //System.out.println(kerudungbs.tampilkanInfo());
        //System.out.println(kerudungbs.tampilkanInfo("nude"));
        //erro bandling
        try{
                //IO sederhana
             Scanner scanner = new Scanner(System.in);

             //Array
             kerudungMain[] kerudungbs = new kerudungMain[1];
             //perulangan menggunakan for
             for(int i=0; i<kerudungbs.length; i++){


                  System.out.print("Masukkan Nama kerudung :  "+(i+1)+": ");
                  String nama = scanner.nextLine();
                  System.out.print("Masukkan kode kerudung : " +(i+1)+": ");
                  String kode= scanner.nextLine();
                  
                    //objek
                  kerudungbs[i] = new kerudungMain(nama, kode);
             }
              //perulangan dalam bentuk array
             for(kerudungMain data: kerudungbs){
                 System.out.println("=============================");
                 System.out.println("Data Kerudung");
                  System.out.println(data.displayInfo());
                    }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Kesalahan format kode: " + e.getMessage());
        } catch (NumberFormatException e){
            System.out.println("Kesalahan Format Number: " + e.getMessage());
        }
    }
}
