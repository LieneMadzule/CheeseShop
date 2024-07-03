```
public class Cheese{
  private int id;
  private String name;
  private float cost;

  public Cheese(int id, String name, float cost){
    this.id = id;
    this.name = name;
    this.cost = cost;
  }

  public int getId(){
    return id;
  }

  public void setName(String name){
    //Do some logic here

    this.name = name;

    //Do some logic here
  }

  public String getName(){
    return name;
  }

  public void setCost(int cost){
    // Check whether or not the user is a cashier, and if it is, then allow to change the cost.
    this.cost = cost;
  }

  public float getCost(){
    return cost;
  }
}```
