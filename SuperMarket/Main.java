// TODO (DONEは*)
// * "Hello world"を出力
// * 入力を受け取り、何か文字列を出力する
// * 入力を受け取り、その情報を反映した出力を行う
// * 空の商品リストを作る (HashMap)
// * リストに１つの商品情報を追加する
// * Itemクラスを作る
// * Itemクラスにgetterを作る（価格を取り出す）
// * リストに複数要素を追加する
// ＊ ItemのgetNameをしてみる
// * 商品一つの金額を求める
// * 商品ごとの金額の和を求める
// * setMapのリファクタリングする
// * 商品番号を格納したリストを作る
// * とりあえず、３つの商品を格納してみる
// * ショッピングバッグに商品を追加するメソッドを作る
// 金額を計算するメソッドを作る
// 商品番号をitemに変換するメソッドを作る



import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;

class Main {  
  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    // 商品の情報を含む配列を作る
    ItemList itemList = new ItemList();

    Map<Integer, Integer> product = new HashMap<>();
    System.out.println("商品IDを入力してください。");
		String line = sc.nextLine();
		int id = Integer.parseInt(line);
    System.out.println("商品個数を入力してください。");
		line = sc.nextLine();
		int num = Integer.parseInt(line);
		product.put(id, num);
    
    sc.close();
    Item item = itemList.getItem(id);
		ShoppingBag orderList = new ShoppingBag();
		orderList.addShoppingBag(item);
		orderList.printShoppingBag();
    int total = orderList.sumTotalPrice(product.get(id));
    System.out.println("合計 : " + total + "円");

  }
}

