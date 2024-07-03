```
import java.util.ArrayList;

public class ItemService{
  //Item service functionality in different class
  // adding items
  // remove items
  // update items
  // get items
  // ItemService.java
  private ArrayList<Cheese> items = new ArrayList<Cheese>();
  private ArrayList<Cheese> cart = new ArrayList<Cheese>();

  // ItemService.java
  public ArrayList<Cheese> getItems() {
    return items;
  }

  // ItemService.java
  public void addItem(Cheese item) {
    items.add(item);
  }

  // ItemService.java
  public void removeItem(int id) {
    for (var item : items) {
      if (item.getId() == id) {
        items.remove(item);
        return;
      }
    }
  }

  // ItemService.java
  public void updateItem(int id, String name, int cost) {
    for (var item : items) {
      if (item.getId() == id) {
        item.setName(name);
        item.setCost(cost);
        return;
      }
    }
  }
}```
