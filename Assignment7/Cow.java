import java.util.Random;

class Cow extends Thread{
	static LinkedList Link = new LinkedList();

	public Cow(){
	}
	Random ranint = new Random();

	@Override
	public void run(){
		while(true){

			Link.add(new Milk());
			try{
				int ranNum = ranint.nextInt(10001-5000)+5000;
				Thread.sleep(ranNum);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

		}

	}

	public static boolean haveMilk(){
		if(Link.isEmpty()){
			return false;
		}
		else{
			return true;
		}
	}
	public static Milk takeMilk(){
		return Link.getNext();
	}
	public int countMilk(){
		return Link.countItems();
	}
}
