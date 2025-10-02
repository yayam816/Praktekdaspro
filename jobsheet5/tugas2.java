package Praktekdaspro.jobsheet5;
import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input sebuah bilangan: ");
    int angka = sc.nextInt();

    if (angka %2 == 0) {
        System.out.println("Bilangan ini Genap");
    }
    else {
        System.out.println("Bilangan ini Ganjil");
    }
    
    }
}