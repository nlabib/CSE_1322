public class BlueRayCollection{

	private Node head=null;

	public void add(String title,String director,double cost,int year) {
		BlueRayDisk blueRayDisk=new BlueRayDisk(title, director, cost, year);
		//System.out.println("as");
		Node node=new Node();
		node.blueRayDisk=blueRayDisk;
		node.next=null;

		if(head==null) {
			head=node;
			return;
		}

		Node currentNode=head;
		while(currentNode.next!=null) {
			currentNode=currentNode.next;
		}

		currentNode.next=node;


	}

	public void show_all() {
		Node currentNode=head;

		while(currentNode!=null) {
			System.out.println(currentNode.blueRayDisk.toString());
			currentNode=currentNode.next;
		}

	}
}

