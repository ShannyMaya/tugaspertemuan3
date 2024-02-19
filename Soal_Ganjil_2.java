import java.util.Scanner;

public class Java2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();

        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = scanner.nextBoolean();

        if (uang > 5000 && !hujan) {
            System.out.println("Anda dapat membeli gorengan");
        } else {
            System.out.println("Anda tidak dapat membeli gorengan.");
        }

        scanner.close();
    }
}
