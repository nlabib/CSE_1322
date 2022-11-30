import java.util.LinkedList;
import java.util.Random;

public class PrimeTest{
	private static int findFactor(int target, Prime p){
		for(int i = 0; i <= target; i++){
			if(target % p.getPrime(i) == 0){
				return p.getPrime(i);
			}
		}
		return - 1;
	}

	public static void main(String[] args){
		final int N = 10000;
		Prime p = new Prime(N);
		int target = (new Random()).nextInt(N);
		System.out.printf("What primes make up %1$s?" + "\r\n", target);
		LinkedList<Integer> factors = new LinkedList<Integer>();
		while(target >= 2){
			int factor = findFactor(target, p);
			factors.addFirst(factor);
			target /= factor;
		}

		for(int i = 0; i < factors.size(); i++){
			if(i == 0){
				System.out.printf("%1$s", factors.get(i));
			} else{
				System.out.printf("x%1$s", factors.get(i));
			}
		}
		System.out.println();
	}
}
