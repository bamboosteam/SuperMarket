// * 商品番号を格納したリストを作る
// * とりあえず、３つの商品を格納してみる
// * ショッピングバッグに商品を追加するメソッドを作る
// * Itemのリスト型で商品を保持する
// * PriceCalculationのメソッドに、orderlistを渡して、totalPriceに合計値を保持する

import java.util.ArrayList;

class ShoppingBag{
  private ArrayList<Item> orderList = new ArrayList<>();
  private int totalPrice = 0;

	public ShoppingBag(){
	}

  public void addShoppingBag(Item item){
    orderList.add(item);
  }

  public ArrayList<Item> getOrder(){
    return orderList;
  }

  public void printShoppingBag(){
      System.out.println("買い物カゴ一覧");
      System.out.println("-----------------------------------");
      for(Item item : orderList) {
          System.out.println("商品名：" + item.getName() + " 価格：" + item.getPrice());
        }
      System.out.println("-----------------------------------");
        
    }
  
  public int sumTotalPrice(int num){
    PriceCalculation priceCalculation = new PriceCalculation();
    totalPrice = priceCalculation.sumTotalPrice(orderList,num);
    return totalPrice;
  }
}