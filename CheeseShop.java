```
import java.util.ArrayList;

public class CheeseShop {

  // Shop functionality
  // AddItemToCart -> done
  // Get the items list -> done
  // RemoveItemFromCart -> future
  // Checkout (get the totalPrice)
  private ArrayList<Cheese> cart = new ArrayList<Cheese>();

  public void addItemToCart(Cheese item) {
    // items list, it would contain the amount of available items
    // Before we add item to the cart, we would check whether or not it is available
    cart.add(item);
  }

  public int checkout() { // get the total cost
    int sum = 0;
    for (var item : cart) {
      sum += item.getCost();
    }
    return sum;
  }

}```
