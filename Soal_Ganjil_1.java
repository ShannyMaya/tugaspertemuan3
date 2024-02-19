import java.util.Scanner;

public class Dasar_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int b1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int b2 = input.nextInt();

        System.out.print("Masukkan bilangan ketiga: ");
        int b3 = input.nextInt();

        System.out.println("Hasil penjumlahan: " + (b1 + b2 + b3));
        System.out.println("Hasil pengurangan: " + (b1 - b2 - b3));
        System.out.println("Hasil perkalian: " + (b1 * b2 * b3));

        if (b2 != 0 && b3 != 0) {
            System.out.println("Hasil pembagian: " + ((double) b1 / b2 / b3));
        } else {
            System.out.println("Tidak dapat melakukan pembagian terdapat nol");
        }

        input.close();
    }
}
