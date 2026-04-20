// ===============================================
// UTS PART 2 - Struktur Data
// Nama  : Salma Salsabila
// NPM   : 25161562009
// kelas : 2/A
// ===============================================

import java.util.Scanner;

public class UTSPart2Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // kondisi dasar pertama
        } else if (n == 1) {
            return 1; // kondisi dasar kedua
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // pemanggilan rekursif
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku Fibonacci: ");
        int n = input.nextInt();

        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i));

            if (i < n) {
                System.out.print(", ");
            }
        }

        input.close();
    }
}