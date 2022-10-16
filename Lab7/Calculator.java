import java.util.Scanner;

public class Calculator implements CalcOp{

	@Override
	public float add(float a, float b){
		float sum = a + b;
		return sum;
	}
	@Override
	public float subtract(float a, float b){
		float sum = a - b;
		return sum;
	}
	@Override
	public float multiply(float a, float b){
		float sum = a * b;
		return sum;
	}

	@Override
	public float divide(float a, float b){
		float sum = a / b;
		return sum;
	}


}
