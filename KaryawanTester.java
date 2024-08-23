//Driver Class
import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan nama:");
        String nama = input.nextLine();
        System.out.println("Inputkan unit:");
        String unit = input.nextLine();
        System.out.println("Inputkan alamat:");
        String alamat = input.nextLine();
        System.out.println("Inputkan ID:");
        int id = input.nextInt();

        Karyawan Salman = new Karyawan(id, nama, unit, alamat);
        Salman.print();
        input.close();
        //object
        //Class object = new Constructor
        Karyawan a = new Karyawan(1, "Joni", "BK", "Bekasi");
        Karyawan b = new Karyawan(2, "Aldi", "Kurikulum", "Tangerang");
        Karyawan c = new Karyawan(3, "Putri", "TU", "Bali");
        Karyawan d = new Karyawan(4, "Icha", "Kesiswaan", "Jakarta");
        Karyawan e = new Karyawan(5, "Budi", "TU", "Tulungagung");

        a.print();
        b.print();
        c.print();
        d.print();
        e.print();
input.close();

    }
}