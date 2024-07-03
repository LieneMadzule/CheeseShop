```
import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static ItemService itemService = new ItemService();
    public static void main(String[] args) {
        while(true){
            System.out.println("Press 1 to add an cheese");
            System.out.println("Press 2 to print all cheeses");
            System.out.println("Press 3 to remove an cheese");
            System.out.println("Press 4 to update an cheese");
            int action = scanner.nextInt();
            if(action == 1){
                addItem();
            } else if(action == 2){
                printItems();
            } else if(action == 3){
                removeItem();            
            }else if(action == 4){
                updateItem();            
            }else{
                break;
            }
        }

          
    }

    public static void addItem(){
        System.out.println("Provide the id of the cheese: ");
        int id = scanner.nextInt();
        System.out.println("Provide the name of the cheese: ");
        String name = scanner.next();
        System.out.println("Provide cost of the cheese: ");
        float cost = scanner.nextFloat();

        var item = new Cheese(id, name, cost);
        itemService.addItem(item);

    }

    public static void printItems(){
        System.out.println("These are the cheeses in the storage: ");
        var items = itemService.getItems();
        for (var item : items){
            System.out.println(item.getId() + ". " + item.getName() + " - " + item.getCost() + " EUR");
        }
    }

    public static void removeItem(){
        printItems();
        System.out.println("Which cheese do you want to remove? Enter the id: ");
        var removed = scanner.nextInt();
        itemService.removeItem(removed);
        System.out.println("Cheese with id " + removed + " removed successfully");
    }

    public static void updateItem(){
        printItems();
        System.out.println("Which cheese do you want to update? Enter the id: ");
        var updated = scanner.nextInt();
        System.out.println("Provide the name of the cheese: ");
        String name = scanner.next();
        System.out.println("Provide the cost of the sheese: ");
        int cost = scanner.nextInt();

        itemService.updateItem(updated, name, cost);
        System.out.println("Cheese with id " + updated + " updated successfully");
    }
}``` 
