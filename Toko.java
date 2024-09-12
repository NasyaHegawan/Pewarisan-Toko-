package Pewarisan;

import java.util.Scanner;

public class Toko {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // sebagai pencegah error karena tipe data yang tidak sesuai
        try {
            System.out.println("Sialahkan pilih 1 untuk membuat CD atau 2 untuk membuat DVD");
            int pilihan = in.nextInt();
            if (pilihan == 1) {
                CD a = new CD();
                a.print();

            } else if (pilihan == 2) {
                DVD b = new DVD();
                b.print();

            } else {
                System.out.println("Pilihan tersebut tidak ada di data kami");
            }
        } catch (Exception e) {
            System.out.println("Tipe data salah (hanya menerima angka)");
        }

        in.close();

    }
}
