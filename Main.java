import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Integer> inventory = new HashMap<>();

        int choice;
    
        do { 
            System.out.println("=====EWAN KO DITO=====");
            System.out.println("1. View System Menu");
            System.out.println("2. Create Order");
            System.out.println("3. View Recommended Food");
            System.out.println("4. Sales Report");
            System.out.println("0. Exit");
            System.out.print("Select a number: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("=====SYSTEM MENU=====");
                    System.out.println("1. Add new Menu");
                    System.out.println("2. View Current list of Menu");
                    System.out.println("3. Update Price");
                    break;
                case 2:
                    System.out.println("=====CREATE ORDER=====");
                    break;
                case 3:
                    System.out.println("=====RECOMMENDED FOOD=====");
                    break;
                case 4:
                    System.out.println("=====SALES REPORT=====");
                    break;
                case 0:
                    System.out.println("Exited!");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (choice != 0);
    }
}
