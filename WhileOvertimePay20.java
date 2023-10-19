package jobsheet7;
import java.util.Scanner;
public class WhileOvertimePay20 {
    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);
        int numEmployee, overtimehours;
        double overtimepay=0;
        double totalOvertimePay=0;
        String position;

        System.out.print("Employee number = ");
        numEmployee = input20.nextInt();

        int i=0;
        while(i<numEmployee){
            System.out.print("Position of employee "+(i+1)+" (director, manager, staff)= ");
            position = input20.next();
            System.out.print("Employee "+(i+1)+" overtime hours = ");
            overtimehours = input20.nextInt();
            i++;
            
            if(position.equalsIgnoreCase("director")){
                continue;
            }else if(position.equalsIgnoreCase("manager")){
                overtimepay=overtimehours*100000;
            }else if(position.equalsIgnoreCase("staff")){
                overtimepay=overtimehours*75000;
            }
            totalOvertimePay += overtimepay;
        }
        System.out.println("Total of the Overtime Pay = "+totalOvertimePay);
    }

    
}
