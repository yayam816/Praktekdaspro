package Praktekdaspro.jobsheet5;
import java.util.Scanner;
public class tugas3b {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Status Anda saat ini: ");
    String user = sc.nextLine();

    if (user.equals("Dosen")) {
        System.out.println("Akses Wifi sudah diberikan untuk dosen");
    }
    else if (user.equals("Mahasiswa")) {
        System.out.println("Berapa SKS yang sudah diambil?");
        int sks = sc.nextInt();
        if (sks >=12) {
            System.out.println("Akses Wifi diberikan");
        }
        else {
            System.out.println("Akses Wifi tidak diberikan");
        }
    }
    else {
        System.out.println("Akses ditolak");
    }
    }
}
