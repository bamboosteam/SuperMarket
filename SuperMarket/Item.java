class Item{
  //private int id;
  private String name;
  private int price;

  public Item(String name, int price){
    this.name = name;
    this.price = price;
  }

  public String getName(){
    return name;
  }

  public int getPrice(){
    return price;
  }
  
}