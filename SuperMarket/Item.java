enum Item{
    itme1(1, "fruit", "りんご", 100),
    item2(2, "fruit", "みかん", 40),
    item3(3, "fruit", "ぶどう", 150),
    item4(4, "food", "のり弁", 350),
    item5(5, "food", "しゃけ弁", 400),
    item6(6, "cigarette", "タバコ", 420),
    item7(7, "cigarette", "メンソールタバコ", 440),
    item8(8, "item", "ライター", 100),
    item9(9, "drink", "お茶", 80),
    item10(10, "drink", "コーヒー", 100);

    private int id;
    private String category;
    private String name;
    private int price;

    private Item(){
    }

    private Item(int id,String category,String name,int price){
      this.id = id;
      this.name = name;
      this.category = category;
      this.price = price;
    }
  
  public static Item showAllItem(){
    System.out.println("\t\t商品一覧");
    System.out.println("-----------------------------------");
    System.out.println("\tID：\t商品名:価格");
    System.out.println("-----------------------------------");
    for(Item item: Item.values()){
       System.out.println("\t" + item.getId() + " ：\t" + item.getName() + ":" + item.getPrice() + "円");
    }
    System.out.println("-----------------------------------");
    return null;
  }

  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getCategory() {
    return category;
  }
  public int getPrice() {
    return price;
  }
  public static Item getById(int id){
    for(Item item : Item.values()){
      if(item.getId() == id){
        return item;
      }
    }
    return null;
  }

}