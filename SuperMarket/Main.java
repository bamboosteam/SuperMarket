import java.util.Scanner;
import java.util.ArrayList;

class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ShoppingBag orderList = new ShoppingBag();

    int totalPrice = 0; //税抜き合計金額
    int taxTotalPrice = 0; //税込み合計金額
    boolean loop = true; //Whileの制御変数

    System.out.println("店長「へい！　らっしゃい！！！」");
		Item.showAllItem();

    while(loop){
      //商品IDの入力
      System.out.println("商品IDを入力してください。");
		  String line = sc.nextLine();
      int id = Integer.parseInt(line);

      //取得した商品IDを用いてItemクラスから商品情報をItem型で取得
      Item item = Item.getById(id);
    
      //商品個数の入力
      System.out.println(item.getName() + "の購入個数を入力してください。");
      line = sc.nextLine();
      int num = Integer.parseInt(line);

      //ShoppingBagクラスに取得した商品情報を追加
      orderList.addShoppingBag(item,num);

      //yを入力で(loop = true), nもしくはそれ以外の文字列を入力で(loop = false) 
      System.out.println("買い物を続けますか？(y/n)");
      line = sc.nextLine();
      if(line.equals("y")){
      }else{
        sc.close();
        loop = false;
      }
    }

		// 合計金額（税抜き）を計算
		totalPrice = orderList.getTotalPrice()[0];
    // 合計金額（税込み）を計算
    taxTotalPrice = orderList.getTotalPrice()[1];

    //買い物カゴ一覧表示
    orderList.printShoppingBag();
    
    //税抜き合計金額を表示
    System.out.println("合計(税抜き) : " + totalPrice + "円");

    //税込み合計金額を表示
    System.out.println("合計(税込み) : " + taxTotalPrice + "円");
    System.out.println("看板娘「ま・い・ど・あ・り」");

  }
}