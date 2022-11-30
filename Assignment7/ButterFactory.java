public class ButterFactory extends Thread{
	int milkcount = 0;

	public void run(){
		while(true){
			if(Cow.haveMilk()){
				Cow.takeMilk();
				milkcount++;
				System.out.println("Butter Factory got milk from a cow");
				System.out.println("Now Butter Factory has" + milkcount + " milk");
				if(milkcount == 4){
					System.out.println("I made cream");
					milkcount -= 4;
					try{
						Thread.sleep(1000);
					} catch(Exception e){
						System.out.println("Error in Butter Factory" + e.getMessage());
					}
				}
			}
		}

	}
}

