import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        double BMI, beratBadan, tinggiBadan;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Berat Badan (kg):");
        beratBadan = input.nextDouble();
        System.out.println("Masukkan tinggi badan (m):");
        tinggiBadan = input.nextDouble();

        BMI = beratBadan/(tinggiBadan*tinggiBadan);

        System.out.println("BMI dengan berat "+beratBadan+" dan tinggi "+tinggiBadan+" adalah "+BMI);
        
    }
}
    
