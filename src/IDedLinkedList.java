

public class IDedLinkedList <AnyType extends IDedObject>{
	
	Node head;
	
	public IDedLinkedList(){
		head = null;
	}
	
	public void makeEmpty() {
		head = null;
	}
	
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
	
	public AnyType deleteFromFront(){
		Node deleted = head;
		Node newHead = head.next;
		head = newHead;
		return deleted.data;
	}
	
	public AnyType delete(int ID){
			AnyType deleted = findID(ID);
			Node temp = head;
			if (deleted == null) {
				return deleted;
			}
			else if (deleted.getID() == ID) {
				head = temp.next;
			}
			else {
				while(temp != null) {
					if (deleted.getID() == temp.data.getID()) {
						Node next = temp.next.next;
						temp.next = next;
					}
				}
			}
			return deleted;
	}
	
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

