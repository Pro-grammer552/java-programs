package CLL;

public class cll {

	Node head;
	Node tail;
	int size =0;
	
	public void addlist(int value) {
		Node temp = new Node(value);
		temp.next = head;
		head = temp;
		if ( tail == null) {
			tail = head;
		}
		size++;
	}
	
	public void addlast(int value) {
			
		Node temp = new Node(value);
		tail.next = temp;
		tail = temp;
		size++;
	}
	
	public void display() {
		Node temp = head;
		
		while ( temp != null) {
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}
		public Node(int value,Node next) {
			this.value = value;
			this.next = next;
		}
	}
}
