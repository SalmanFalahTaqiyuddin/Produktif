import java.util.Scanner;

public class tarifParkir {
     public static void main(String[] args) {
    String platNomor;
    int jumlahJam;
    double harga;

    Scanner s = new Scanner(System.in);
    System.out.print("Masukkan nomor plat: ");
    platNomor = s.nextLine();
    System.out.print("Jumlah jam: ");
    jumlahJam= s.nextInt();

    if (jumlahJam >0 && jumlahJam <=1){
        harga = 3000;
      } else if (jumlahJam >1 && jumlahJam<=4) {
        harga = 7000;
      } else if (jumlahJam>4) {
        harga = 10000;
      } else {
        harga = 0;
        System.out.println("System Error");
      }
      System.out.println("Plat nomor: "+platNomor);
      System.out.println("Tarif parkir: "+harga);




      
     }
    }

