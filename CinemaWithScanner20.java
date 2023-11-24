package jobsheet10;
import java.util.Scanner;

public class CinemaWithScanner20 {

    public static void main(String[] args) {
        Scanner input20 = new Scanner(System.in);

        int row, column;
        int menuChoice;
        String name, next;

        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu Options: ");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            menuChoice = input20.nextInt();
            input20.nextLine();

            switch (menuChoice) {
                case 1:
                    System.out.println("Enter a name: ");
                    name = input20.nextLine();
                    System.out.println("Enter a row number: ");
                    row = input20.nextInt();
                    System.out.println("Enter a column number");
                    column = input20.nextInt();
                    input20.nextLine();
                    
                    if (audience[row][column] != null) {
                        System.out.println("Warning the selected seat is already occupied. Please choose another seat.");
                        break; //Exit the switch statement and go back to the menu
                    }

                    //Check if the row and column numbers are within the valid range
                    if (row >= 0 && row < audience.length && column >= 0 && column < audience[0].length) {
                        // Assign the name to the specified seat
                        audience[row][column] = name;
                        System.out.println("Dta input successfull !");
                    } else {
                        System.out.println("Invalid row or column numbers. Please try again.");
                    }
                    break;
                case 2:
                    for (int i = 0; i <audience.length; i++) {
                        for (int j = 0; < audience[1].length; j++) {
                            if (audience[i][j] == null) {
                                audience[i][j] = "***";
                            }
                        }
                    }
                    //Print the audience list
                    for (int i = 0; i < audience.length; i++) {
                        for (int j = 0; j < audience[i].length; j++) {
                            System.out.print(audience[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    //Exit the programs
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}