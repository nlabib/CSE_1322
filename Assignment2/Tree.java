public class Tree{
	private int height;
	private char myChar;

	//Default Constructor
	public Tree(int height){
		if(height < 0){
			this.height = 0;
		}else{this.height = height;}
		this.myChar = 'V';
	}
	//Setter for mychar
	public void setMyChar(char myChar){
		this.myChar = myChar;
	}

	public void grow(double m){
		if(m >= 12){
			height++;
			System.out.println("We are growing!");
		}
	}

	//Draws the tree
	public void drawMe(){
		for (int i= 0; i<= height-1 ; i++)
		{
			for (int j=height-1; j>i; j--)
			{
				System.out.print(" ");
			}
			for (int k=0; k<=i; k++)
			{
				System.out.print(myChar + " ");
			}
			System.out.println();
	}}

	//Sets the input value of the height
	public void setHeight(int height){
		if(height < 0){
			this.height = 0;
		}else{this.height = height;}
	}


}
