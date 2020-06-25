import java.util.ArrayList;

class ShoppingBag{
  private int[] numberOrder;
  private Item[] orderList;
  private PriceCalculation priceCalculation;
  //private ArrayList<int> allTempPrice = new ArrayList<>();


	public ShoppingBag(){
    numberOrder = new int[11];
    orderList = new Item[11];
    priceCalculation = new PriceCalculation();
	}

  public void addShoppingBag(Item item,int num){
    orderList[item.getId()] = item; 
    numberOrder[item.getId()] += num;
  }

  //shoppingbagの中身の合計
  public int[] getTotalPrice(){
    int tempPrice = 0;
    int[] totalPrice = {0, 0};
    for(Item item : orderList){
      if(item != null){
        tempPrice = priceCalculation.sumItemPrice(item, numberOrder[item.getId()]);
        if(numberOrder[item.getId()] >= 3 && item.getCategory().equals("cigarette") == false){
        	// ３つ以上で一割引
        	tempPrice = priceCalculation.discountSumItemPrice(item, numberOrder[item.getId()]);
        }
        // 最終的な合計金額を計算する
        //税抜き合計価格
        totalPrice[0] += tempPrice;
        //税込み合計価格
				totalPrice[1] += priceCalculation.taxItemPrice(item, tempPrice);
      }
    }
    return totalPrice;
  }

  //おまけの判断
  public void bonus(){
    for(int i = 1; i < numberOrder.length; i++){
			int num = numberOrder[i];
      if(num >= 10){
        //たばこのとき
        if(orderList[i].getCategory().equals("cigarette")){
          System.out.println("-----------------------------------");
					bonusCigarette();
          System.out.println("-----------------------------------");
        }
        //タバコ以外
        else{
          System.out.println("-----------------------------------");
          bonusItem(i);
          System.out.println("-----------------------------------");
        }
      }
    }
  }

  //たばこのおまけメソッド
	public void bonusCigarette(){
		addShoppingBag(Item.getById(8), 1);
    System.out.println("ライターのおまけ!!");
	}

  //たばこ以外のおまけメソッド  
  public void bonusItem(int i){      
		int num = numberOrder[i];
		numberOrder[i] += num / 10;
    System.out.println(orderList[i].getName() + (num / 10) + "個おまけ!!");
	}
  
  
  public void printShoppingBag(){
    bonus();
    System.out.println("\t\t買い物カゴ一覧");
    System.out.println("-----------------------------------");
    
    for(Item item : orderList) {
      if(item != null){
        	System.out.println("商品名：" + item.getName() + "\t個数：" + numberOrder[item.getId()] + "\t単価：" + item.getPrice());
        }
      }
    System.out.println("-----------------------------------");
  }

}