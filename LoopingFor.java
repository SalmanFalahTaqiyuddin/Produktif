import java.util.Scanner;

public class LoopingFor {
    public static void main(String[] args) {

        int jumlahSiswa;
        double nilai, total =0 , rata;

        Scanner s = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        jumlahSiswa = s.nextInt();
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-"+i);
            nilai = s.nextInt();
            total += nilai;
            
          }
          rata = total/jumlahSiswa;
          System.out.println("Total nilai: " + total);
          System.out.println("Rata-rata: "+ rata);
    }
}
