class Main {
	public static void main(String[] args) {

		Thread[] threads =new Thread[4];

		for(int i =0; i< threads.length; i++){
			threads[i] = new Thread(new Cow());

		}
		for(int i = 0; i < 4; i++){
			threads[i].start();
		}

		ButterFactory myButterFactory = new ButterFactory();

		Thread t5 = new Thread(myButterFactory);

		t5.start();

		CreamFactory myCreamFactory = new CreamFactory();

		Thread t6 = new Thread(myCreamFactory);

		t6.start();
	}
}