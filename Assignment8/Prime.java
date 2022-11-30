import java.util.*;

public class Prime{
	private LinkedList<Integer> primeList = new LinkedList<Integer>();

	public Prime(int max){
		boolean[] primes = new boolean[max];

		for(int i = 0; i < max; i++){
			primes[i] = true;
		}

		primes[0] = false;
		primes[1] = false;

		for(int i = 2; i <= (int) Math.sqrt(max); i++){
			for(int j = i + 1; j < max; j++){
				if(j % i == 0){
					primes[j] = false;
				}
			}
		}

		for(int i = 0; i < max; i++){
			if(primes[i]){
				primeList.addLast(i);
			}
		}
	}

	public final boolean isPrime(int n){
		for(int i : primeList){
			if(i == n){
				return true;
			}
		}
		return false;
	}

	public final int getPrime(int index){
		return primeList.get(index);
	}
}

