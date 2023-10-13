import java.util.Scanner;
public class Selection120 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        System.out.print("Input a number = ");
        int number = input20.nextInt();
        String output = (number%2 == 0) ? number+" Is an even number!" : number+" Is an odd number!";
        System.out.println(output);
    }
}