

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
		
	}
	
	public boolean insertAtFront(AnyType x) {
		
	}
	
	public AnyType deleteFromFront(){
		Node deleted = head;
		Node newHead = head.next;
		head = newHead;
		return deleted.data;
	}
	
	public AnyType delete(int ID){
		
	}
	
	public int printTotal(){
		int total = 0;
		while(head != null) {
			total = total + head.data.getID();
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

