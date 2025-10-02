package Praktekdaspro.jobsheet5;
import java.util.Scanner;
public class nestedUjianSkripsi26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pesan;
    
    System.out.print("Apakah Mahasiswa Sudah Bebas Kompen? (Ya/Tidak): ");
    String bebasKompen = sc.nextLine().trim();

    System.out.println("Masukkan jumlah log bimbingan Pembimbing 1: ");
    int bimbingan1 = sc.nextInt();
    System.out.println("Masukkan jumlah log bimbingan Pembimbing 2: ");
    int bimbingan2 = sc.nextInt();

    if (bebasKompen.equalsIgnoreCase("Ya")) {
        if (bimbingan1 >=8 && bimbingan2 >=4) {
        pesan = "Semua syarat terpenuhi, Mahasiswa boleh mendaftar ujian skripsi";
        }
    
    else if (bimbingan1 < 8 && bimbingan2 < 4) {
        pesan = "Gagal! Log Bimbingan P1 kurang dari 8 dan P2 kurang dari 4";
    }
    else if (bimbingan1 < 8) {
        pesan = "Gagal! Bimbingan P1 masih kurang dari 8 ";
    }
    else if (bimbingan2 < 4) {
        pesan = "Gagal! Bimbingan P2 masih kurang dari 4";
    }
}
else {
    pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    System.out.println(pesan);
}
    }
}
