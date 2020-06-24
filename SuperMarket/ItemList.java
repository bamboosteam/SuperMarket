import java.util.HashMap;
import java.util.Map;

class ItemList{
  private Map<Integer, Item> itemMap = new HashMap<>();

  public ItemList(){
    setMap(1, new Item("りんご", 100));
    setMap(2, new Item("みかん", 40));
    setMap(3, new Item("ぶどう", 150));
    setMap(4, new Item("のり弁", 350));
    setMap(5, new Item("しゃけ弁", 400));
    setMap(6, new Item("タバコ", 420));
    setMap(7, new Item("メンソールタバコ", 440));
    setMap(8, new Item("ライター", 100));
    setMap(9, new Item("お茶", 80));
    setMap(10, new Item("コーヒー", 100));
  }

  public void setMap(int num, Item item){
    itemMap.put(num, item);
  }

  public Map getMap(){
    return itemMap;
  }

  public Item getItem(int num){
    return itemMap.get(num);
  }
}