

public class IDedLinkedList <AnyType extends IDedObject>{
	
	Node head;
	
	//IDedLinkedList Constructor
	public IDedLinkedList(){
		head = null;
	}
	
	//Empty the list using java garbage collector
	public void makeEmpty() {
		head = null;
	}
	
	//Finds the ID given to it
	public AnyType findID(int ID) {
		AnyType x = null;
		Node last = head;
		while(last != null) {
			if(ID == last.data.getID()) {
				x = last.data;
			}
			last = last.next;
		}
		return x;
	}
	
	//Inserts a new node into the from of the linked list
	public boolean insertAtFront(AnyType x) {
		if (findID(x.getID()) == null) {
			Node newNode = new Node(x);
			newNode.next = head;
			head = newNode;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Deletes a node from the front
	public AnyType deleteFromFront(){
		Node deleted = head;
		head = head.next;
		return deleted.data;
	}
	
	//Deletes a specific node from the ID given. Uses FindID
	public AnyType delete(int ID){
			AnyType deleted = findID(ID);
			Node temp = head;
			if (deleted == null) {
			}
			else if (temp.data.getID() == ID) {
				deleteFromFront();
			}
			else {
				while(temp != null) {
					if (ID == temp.next.data.getID()) {
						Node next = temp.next.next;
						temp.next = next;
						break;
					}
					temp = temp.next;
				}
			}
			return deleted;
	}
	
	//Prints the total of the current existing nodes
	public int printTotal(){
		int total = 0;
		Node last = head;
		while(last != null) {
			total = total + last.data.getID();
			last = last.next;
		}
		return total;
	}
	
	class Node{
		AnyType data;
		Node next;
		
		Node (AnyType d){
			data = d;
			next = null;
		}
	}
}

