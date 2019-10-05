import java.util.ArrayList;
import java.util.List;
import java.lang.StringBuilder;


public class MyItem implements IDedObject {
	private int itemID;
	private int itemPrice;
	private List<Integer> itemDescription;
	
	//MyItem Constructor
	public MyItem (int id, int price, List<Integer> name) {
		this.itemID = id;
		this.itemPrice = price;
		this.itemDescription = new ArrayList<Integer>(name);
	}
	
	//Gets the ID of MyItem
	public int getID() {
		return itemID;
	}
	
	//Prints the MyItem
	public String printID() {
		StringBuilder sb1 = new StringBuilder();
		sb1.append(itemID + " ");
		sb1.append(itemPrice + " ");
		for (int i = 0; i < itemDescription.size(); i++) {
			sb1.append(itemDescription.get(i) + " ");
		}
		return sb1.toString();
	}
}
