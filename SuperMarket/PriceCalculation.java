// 合計金額を返す関数
// * itemを受け取る。
// * 受け取ったitemの金額を抽出する
// 合計金額を計算する
// 計算した合計金額を返す
import java.util.ArrayList;

class PriceCalculation{
  private int totalPrice = 0;

  public int sumTotalPrice(ArrayList<Item> orderList,int num){
    for(Item item : orderList){
      totalPrice += item.getPrice() * num;
    }
    return totalPrice;
  }
}



