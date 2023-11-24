package jobsheet11;
import java.util.Scanner;
import java.util.Random;

public class Quiz20 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        char menu = 'y';
        do {
            int number = random.nextInt(10);
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();

                if (answer == number) {
                    success = true;
                } else {
                    System.out.println("Jawaban anda " + (answer < number ? "lebih kecil" : "lebih besar") + " dari angka yang benar");
                }
            } while (!success);
            System.out.print("Apakah anda ingin mengulang permainan (Y/y)?");
            menu = sc.nextLine().charAt(0);
        } while (menu == 'y' || menu == 'Y');
        System.out.println("Terima kasih sudah bermain. Selamat tinggal!");
    }
}