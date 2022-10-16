import java.util.Scanner;

public class main{
	public static String repeatNTimes(String s, int n1){
		String string = " ";
		for(int i = 0; i < n1; i++){
			string += s;
	}return string;
	}
	public static boolean isReverse(String s, String s1){
		if(s.length() != s1.length()){
			return false;
		}
		if(s.length() == 1 || s1.length() == 1){
			if(s.equals(s1)){
				return true;
			}
			else{
				return false;
			}
		} else if(s.length() == 0){
			return true;
		}
		else{
			char sf = s.charAt(0);
			char s2f = s1.charAt(s1.length() -1);
			int num = s.length();

			if(sf == s2f){
				String chek1 = s.substring(1);
				String check2 = s1.substring(0, (num -1));
			}
			else{
				return false;
			}
		}

	}

	public static void main(String[] args){
		System.out.println(repeatNTimes ("I must study recursion until it makes sense\n", 100));
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter String 1: ");
		String s = userin.nextLine();
		System.out.println("Enter String 2: ");
		String s1 = userin.nextLine();
		if(isReverse(s, s1) == true){
			System.out.println(s + " is this reverse of " + s1);
		}
		else{
			System.out.println(s + " is not reverse of " + s1);
		}
	}
}
