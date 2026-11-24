import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Map<String, Integer> inventory = new HashMap<>();

        int choice;
    
        do{ 
            System.out.println("=====SELLER SYSTEM=====");
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
                    int choice1;

                    do { 
                    System.out.println("=====SYSTEM MENU=====");
                    System.out.println("1. Add new Menu");
                    System.out.println("2. View Current list of Menu");
                    System.out.println("3. Update Price");
                    System.out.println("4. Back");
                    System.out.print("Select a number: ");
                    choice1 = scan.nextInt();
                    scan.nextLine();
                        switch (choice1) {
                        case 1:
                            System.out.println("=====ADD MENU=====");
                            System.out.print("Input new menu: ");
                            String newMenu = scan.next();
                            System.out.print("Input " + newMenu+ " price: ");
                            int menuPrice = scan.nextInt();
                            scan.nextLine();
                            inventory.put(newMenu, menuPrice);
                            System.out.println("Menu successfully added!");
                            break;
                        case 2: 
                                System.out.println("\n=====CURRENT MENU=====");
                                if (inventory.isEmpty()) {
                                    System.out.println("No menu items available yet.");
                                } else {
                                    for (Map.Entry<String, Integer> item : inventory.entrySet()) {
                                        System.out.println("==============================================");
                                        
                                        System.out.println("- " + item.getKey() + ": " + item.getValue());
                                        System.out.println("==============================================");
                                    }
                                }
                                break;
                             case 4:
                                System.out.println("Returning to main menu...");
                            break;
                        default:
                             
                        System.out.println("Invalid option. Returning to main menu...");
                        choice1 = 4;
                        break;
                    }
                    } while (choice1 != 4);
                    
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


