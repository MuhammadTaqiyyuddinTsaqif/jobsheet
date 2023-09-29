import java.util.Scanner;
public class Selection220 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float finalExam = input20.nextFloat();
        System.out.print("Nilai uts     : ");
        float midExam = input20.nextFloat();
        System.out.print("Nilai kuis     : ");
        float quiz = input20.nextFloat();
        System.out.print("Nilai tugas     : ");
        float assignment = input20.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 0.3F) + (quiz * 0.1F) + (assignment * 0.2F);

        String message = total < 65 ? "Retake" : "Pass";

        System.out.println("Final Grade = " + total + "and t25he decission is " + message);
    }
}