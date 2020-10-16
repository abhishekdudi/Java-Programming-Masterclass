package section8;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have "+ groceryList.size() +
                " items in your grocery list");

        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = groceryList.indexOf(oldItem);
        groceryList.set(position, newItem);
        System.out.println("Grocery item has been modified.");
    }

    public void removeGroceryItem(String item) {
//        int position = groceryList.indexOf(item);
//        groceryList.remove(position);
        groceryList.remove(item);
        System.out.println("Grocery item deleted");
    }

    public void searchItem(String item) {
        if(groceryList.indexOf(item) >= 0)
            System.out.println(item + " found");
        else
            System.out.println(item + " not found");
    }



}
