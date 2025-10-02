package Praktekdaspro.jobsheet5;
import java.util.Scanner;
public class tugas3a {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Apakah Anda membawa Kartu Mahasiswa? (True/False) ");
    Boolean ktm = sc.nextBoolean();

    if (ktm) {
    System.out.println("Anda boleh Masuk");
    }
    else {
        System.out.print("Apakah Anda Sudah Registrasi Online? (True/False) ");
        Boolean regen = sc.nextBoolean();
        if (regen)
        System.out.println("Anda Boleh Masuk");
        else {
            System.out.println("Anda TIdak Boleh Masuk");
        }
    }
    }
}
