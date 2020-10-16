package section8;

import java.util.Scanner;

public class GroceryListMain {
    public static Scanner scanner = new Scanner(System.in);
    public static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printInstructions();
        while(!quit) {
            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    System.out.println("Bye!!!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    private static void printInstructions() {
        System.out.println("Options ");
        System.out.println("\t 0 - print choice options");
        System.out.println("\t 1 - print list");
        System.out.println("\t 2 - add item");
        System.out.println("\t 3 - modify item");
        System.out.println("\t 4 - remove item");
        System.out.println("\t 5 - search item");
        System.out.println("\t 6 - quit");
    }

    private static void addItem() {
        System.out.print("Enter your item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    private static void modifyItem() {
        System.out.print("Enter item to modify: ");
        String oldItem = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        groceryList.modifyGroceryItem(oldItem, scanner.nextLine());
    }

    private static void removeItem() {
        System.out.print("Enter item to delete: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    private static void searchForItem() {
        System.out.print("Item to search for: ");
        String item = scanner.nextLine();
        groceryList.searchItem(item);
    }
}
