package cartSystemExample;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class CartSystem extends TheSystem{
    public CartSystem() throws FileNotFoundException {
    }
    public void display() {
      //Fill the code here
    	HashMap<String, Item> current = this.getItemCollection();
        //Fill the code here
          for (String key : current.keySet()) {
          	Item item = current.get(key);
          	System.out.format("%s - sub total: %s tax: %.2f  total: %.2f \n"
          			,item.getItemName(), 
          			item.getItemPrice()*item.getQuatity() , 
          			item.getItemPrice()*item.getQuatity() * .05 
          			, item.getItemPrice()*item.getQuatity() * 1.05);
          }
    }
}
