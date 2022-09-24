public class FibLteration implements Findfib{


	public int calculate_fib(int num1){
		if(num1 == 1 || num1 == 2){
			return 1;
		} else{
			int first_num = 1;
			int second_num = 1;
			int result = 0;
			for(int i = 3; i <= num1; i++){
				result = first_num + second_num;
				first_num = second_num;
				second_num = result;
			}
			return result;
		}
	}
}
