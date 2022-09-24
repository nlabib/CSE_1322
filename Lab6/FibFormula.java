public class FibFormula implements  Findfib{
	@Override
	public int calculate_fib(int num1){
		double result = ((Math.pow((1+Math.sqrt(5))/2,num1) - Math.pow((1-Math.sqrt(5))/2,num1))/Math.sqrt(5));
		return (int) result;
	}
}
