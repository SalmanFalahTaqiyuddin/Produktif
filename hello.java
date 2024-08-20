import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        // String nama = "Salman";
        // int usia =15;
        // double beratBadan=55.00;
        // float beratBadan1 = 55.0f;
        // char jenisKelamin = 'L';
        // boolean status = false;

        // System.out.println("Selamat datang, "+nama);
        // System.out.println("Usia: "+usia);
        // System.out.println("Jenis kelamin: "+jenisKelamin);

        Scanner input = new Scanner (System.in);
        System.out.println();
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Masukkan Usia: ");
        int usia = input.nextInt();
        System.out.println("Masukkan berat badan: ");
        double beratBadan = input.nextDouble();

        System.out.println("Selamat Datang, "+nama);
        System.out.println("Usia: "+usia);
        System.out.println("Berat badan: "+beratBadan);
    


        
    }
}
