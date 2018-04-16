package cartSystemExample;

import java.awt.ItemSelectable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TheSystem {
    private HashMap<String, Item> itemCollection;
    protected TheSystem() throws FileNotFoundException {
        itemCollection = new HashMap<String, Item>();
        //Fill the code here
        if (getClass().getSimpleName().equals("AppSystem")) {
        	String path = System.getProperty("user.dir") + "\\sample.txt";
    		File items = new File(path);
    		try {
    			Scanner itemSc = new Scanner(items);
    			while (itemSc.hasNextLine()) {
    				String[] line = itemSc.nextLine().split("  ");
    				Item item = new Item();
    				item.setAvailableQuatity(Integer.parseInt(line[3]));
    				item.setItemName(line[0]);
    				item.setItemDesc(line[1]);
    				item.setItemPrice(Double.parseDouble(line[2]));
    				itemCollection.put(item.getItemName(), item);
    			}
        		itemSc.close();
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
    		
        }
    }
    
    public HashMap<String, Item> getItemCollection(){
      //Fill the code here
    	HashMap<String, Item> result = new HashMap<String, Item>(itemCollection);
    	return result;
    }
    
    public void setItemCollection(HashMap<String, Item> copy ){
      //Fill the code here
    	itemCollection.putAll(copy);
    }
    
    public Boolean add(Item item) {
      //Fill the code here
    	if (itemCollection.containsKey(item.getItemName())) {
        	if (checkAvailability(item, 1)) {
        		item.setQuatity(item.getQuatity() + 1);
        		itemCollection.put(item.getItemName(), item);
        		return true;
        	} else return false;
        } else {
        	itemCollection.put(item.getItemName(), item);
        	return true;
        }
    	
    }
    public Item remove(String itemName) {
        Item item = null;
      //Fill the code here
        if (itemCollection.containsKey(itemName)) {
        	item = itemCollection.remove(itemName);
        }
        return item;
    }
    public Boolean checkAvailability(Item item, Integer current) {
      //Fill the code here
    	if (item.getQuatity() + current > item.getAvailableQuatity()) {
    		System.out.println("System is unable to add "
    				+ current + " " + item.getItemName() +
    				". System can only add "
    				+ item.getAvailableQuatity() + " " + item.getItemName() );
    		return false;
    	}
    	else return true;
    }
}
