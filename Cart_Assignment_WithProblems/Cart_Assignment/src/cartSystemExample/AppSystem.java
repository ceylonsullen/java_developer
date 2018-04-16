package cartSystemExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class AppSystem extends TheSystem {
    public AppSystem() throws FileNotFoundException {
    }
    public void display() {
        HashMap<String, Item> current = this.getItemCollection();
      //Fill the code here
        for (String key : current.keySet()) {
        	Item item = current.get(key);
        	System.out.format(item.getItemName() +
    				" description: " + item.getItemDesc() + " price: $%.2f"
    				+ " stock: " + item.getAvailableQuatity() + " quantity: " + item.getQuatity() + "\n" , item.getItemPrice() );
        }
    }
    public Boolean add(Item item) {
      //Fill the code here
        HashMap<String, Item> current = this.getItemCollection();
    	if (current.containsKey(item.getItemName())) {
        	System.out.println( "Item " + item.getItemName() +" is already in the system");
    		return false;
        } else {
        	current.put(item.getItemName(), item);
        	this.setItemCollection(current);
//        	String path = System.getProperty("user.dir") + "\\sample.txt";
//    		File items = new File(path);
//    		FileWriter writer;
//    		try {
//    			writer = new FileWriter(items, true);
//    			writer.write(item.getItemName() + "  "
//    					+ item.getItemDesc() +"  "
//    					+ item.getItemPrice() + "  "
//    					+ item.getAvailableQuatity() + "\n");
//    			writer.close();
//    		} catch (IOException e) {
//    			e.printStackTrace();
//    		}
        	return true;
        }
    }
}
