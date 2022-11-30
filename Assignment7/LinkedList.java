public class LinkedList{
	private Node head;

	public LinkedList(){
		head = null;
	}

	public void add(Milk milk){
		Node temp = new Node(milk);
		if(this.head == null){
			this.head = temp;
		} else{
			Node cur = head;
			while(cur.getNext() != null){
				cur = cur.getNext();
			}
			cur.setNext(temp);
		}
	}

	public Milk getNext(){
		if(this.head == null)
			return null;
		else{
			Node node1 = this.head;
			this.head = this.head.getNext();
			return node1.getMilk();
		}
	}

	public int countItems(){
		int res = 0;
		if(this.head == null)
			return 0;
		else{
			Node cur = this.head;
			while(cur != null){
				cur = cur.getNext();
				res++;
			}
		}
		return res;
	}

	public boolean isEmpty(){
		if(this.head == null)
			return true;
		else
			return false;
	}
}