class CreamFactory extends Thread{
	int milkcount = 0;

	public void run(){
		while(true){
			if(Cow.haveMilk()){
				Cow.takeMilk();
				milkcount++;
				System.out.println("Cream Factory got milk from a cow");
				System.out.println("Now Cream Factory has " + milkcount + " milk");
				if(milkcount == 2){
					System.out.println("I made cream");
					milkcount -= 2;
					try{
						Thread.sleep(1000);
					} catch(Exception e){
						System.out.println("Error in CreamFactory" + e.getMessage());
					}
				}
			}
		}

	}
}

