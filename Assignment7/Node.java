public class Node{
	private Milk milk;
	private Node next;
	public Node(Milk milk){
		milk = milk;
		next = null;
	}
	public Milk getMilk(){
		return this.milk;
	}
	public void setMilk(Milk milk){
		this.milk = milk;
	}
	public Node getNext(){
		return this.next;
	}
	public void setNext(Node next1){
		this.next = next1;
	}



}
