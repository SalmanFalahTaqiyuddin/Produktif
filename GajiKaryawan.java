import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        double jamKerja, tarif, gaji, pajak;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jam kerja karyawan:");
        jamKerja = input.nextDouble();
        System.out.println("Masukkan tarif per jam karyawan:");
        tarif = input.nextDouble();
        System.out.println("Masukkan pajak:");
        pajak = input.nextDouble();


        gaji = jamKerja*tarif;
        pajak=pajak/100*gaji;
        gaji=gaji-pajak;

        System.out.println("Total gaji:" + gaji);
        
    }
}
