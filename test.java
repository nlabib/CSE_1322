public class test{
     public static void main(String []args){
       char myChar = 'V';
       int height = 6;
    
        for(int i =0; i < height-1; i++){
			for(int j = height-1; j > 1; j--){
				System.out.print("");
			}
			for(int k = 0; k <= i; k++){
				System.out.print(" " + myChar);
			}
			System.out.println();
		}
        } 
    } 
