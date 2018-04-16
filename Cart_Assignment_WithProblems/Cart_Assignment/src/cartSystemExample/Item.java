package cartSystemExample;

public class Item{
    private String itemName;
    private String itemDesc;
    private Double itemPrice;
    private Integer quatity;
    private Integer availableQuatity;
    /**
     * @return the itemName
     */
  //Fill the code here 
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public Integer getQuatity() {
		return quatity;
	}
	public void setQuatity(Integer quatity) {
		this.quatity = quatity;
	}
	public Integer getAvailableQuatity() {
		return availableQuatity;
	}
	public void setAvailableQuatity(Integer availableQuatity) {
		this.availableQuatity = availableQuatity;
	}
    
    public Item() {
    	this.quatity = 1;
    }
}
